package com.lazrproductions.heroics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lazrproductions.heroics.config.ModCommonConfigs;
import com.lazrproductions.heroics.event.ModClientEvents;
import com.lazrproductions.heroics.event.ModServerEvents;
import com.lazrproductions.heroics.init.ModBlocks;
import com.lazrproductions.heroics.init.ModCreativeTabs;
import com.lazrproductions.heroics.init.ModEntityTypes;
import com.lazrproductions.heroics.init.ModItems;
import com.lazrproductions.heroics.init.ModSounds;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(ConversationsMod.MODID)
public class ConversationsMod {
    public static final Logger LOGGER = LogManager.getLogger(ConversationsMod.MODID);
    public static final String MODID = "conversations";


    public ConversationsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        ModEntityTypes.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerSounds);

        ModLoadingContext.get().registerConfig(Type.COMMON, ModCommonConfigs.SPEC, "conversations-common.toml");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Running commmon setup for Conversations");
        MinecraftForge.EVENT_BUS.register(new ModServerEvents());
    }

    private void registerSounds(RegisterEvent event) {
        LOGGER.info("Registering sound for Conversations mod");
        ModSounds.register(event);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Running server setup for Conversations");

        // In case you want to add a command
        // Register Commands
        // event.getServer().getCommands().getDispatcher()
        //         .register(
        //                 Commands.literal("handcuff").requires(x -> x.hasPermission(2))
        //                         .then(Commands.literal("get")
        //                                 .then(Commands.argument("players", EntityArgument.players()).executes(x -> {
        //                                     Collection<ServerPlayer> players = EntityArgument.getPlayers(x, "players");
        //                                     for (ServerPlayer player : players)
        //                                         if (CuffedServer.getHandcuffed(player).isGettingOrCurrentlyCuffed()) {
        //                                             if (!CuffedServer.getHandcuffed(player).isSoftCuffed()) {
        //                                                 player.sendSystemMessage(Component.literal(
        //                                                         "" + player.getName().getString()
        //                                                                 + " is handcuffed."));
        //                                             } else {
        //                                                 player.sendSystemMessage(Component.literal(
        //                                                         "" + player.getName().getString()
        //                                                                 + " is soft-cuffed."));
        //                                             }
        //                                         } else {
        //                                             player.sendSystemMessage(Component.literal(
        //                                                     "" + player.getName().getString()
        //                                                             + " is not in handcuffs."));
        //                                         }
        //                                     return 0;
        //                                 }))));
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Running client setup for Conversations");

            MinecraftForge.EVENT_BUS.register(new ModClientEvents());

            //EntityRenderers.register(ModEntityTypes.PADLOCK.get(), PadlockEntityRenderer::new);
        }

        @SubscribeEvent
        public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            //event.registerLayerDefinition(PadlockEntityModel.LAYER_LOCATION, PadlockEntityModel::getModelData);
        }
    }
}