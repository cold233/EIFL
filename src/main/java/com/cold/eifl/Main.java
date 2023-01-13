package com.cold.eifl;

import com.cold.eifl.items.TestItem;
import io.netty.handler.ipfilter.IpSubnetFilter;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
    public Main() {

    }

    public static void main(String[] args) {

    }
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("eifl","item"),
            () -> new ItemStack(Main.TEST_ITEM));
    public static final TestItem TEST_ITEM = new TestItem(new Item.Settings());
    public static final Item CRUSHED_ANCIENT_DEBRIS = new Item(new Item.Settings().group(Main.ITEM_GROUP));
    public static final Block UNFINISHED_END_PORTAL_FRAME = new Block(FabricBlockSettings.of(Material.STONE).hardness(8.0f).mapColor(DyeColor.YELLOW).requiresTool());
    public static final Block DIAMOND_DECORATED_BONEBLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(3.0f).mapColor(DyeColor.WHITE).requiresTool());
    public static final Block LAVA_SOAKED_DIAMOND_DECORRATED_BONEBLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(3.0f).luminance(8).mapColor(DyeColor.WHITE).requiresTool());
    public static final Block LAVA_AND_CHOCHOLATE_SOAKED_DIAMOND_DECORATED_BONEBLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).hardness(3.0f).luminance(6).mapColor(DyeColor.GRAY).requiresTool());
    public static final Block LAVA_AND_CHOCHOLATE_SOAKED_DIAMOND_AND_SHELL_DECORATED_BONEBLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).luminance(4).mapColor(DyeColor.GRAY).requiresTool());
    //public static final Identifier KOBOLD_LOOTTABLE_ID = Entity.
    public static final Logger LOGGER = LoggerFactory.getLogger("Floating_Island_Extral_Items");


    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM,new Identifier("eifl","test_item"),TEST_ITEM);
        Registry.register(Registry.ITEM, new Identifier("eifl","crushed_ancient_debris"),CRUSHED_ANCIENT_DEBRIS);
        Registry.register(Registry.BLOCK, new Identifier("eifl","diamond_decorated_boneblock"),DIAMOND_DECORATED_BONEBLOCK);
        Registry.register(Registry.ITEM, new Identifier("eifl","diamond_decorated_boneblock"), new BlockItem(DIAMOND_DECORATED_BONEBLOCK, new Item.Settings().group(Main.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new  Identifier("eifl","lava_soaked_diamond_decorated_boneblock"), LAVA_SOAKED_DIAMOND_DECORRATED_BONEBLOCK);
        Registry.register(Registry.ITEM, new Identifier("eifl","lava_soaked_diamond_decorated_boneblock"), new BlockItem(LAVA_SOAKED_DIAMOND_DECORRATED_BONEBLOCK, new Item.Settings().group(Main.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new  Identifier("eifl","lava_and_chocolate_soaked_diamond_decorated_boneblock"), LAVA_AND_CHOCHOLATE_SOAKED_DIAMOND_DECORATED_BONEBLOCK);
        Registry.register(Registry.ITEM, new Identifier("eifl","lava_and_chocolate_soaked_diamond_decorated_boneblock"), new BlockItem(LAVA_AND_CHOCHOLATE_SOAKED_DIAMOND_DECORATED_BONEBLOCK, new Item.Settings().group(Main.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new  Identifier("eifl","lava_and_chocolate_soaked_diamond_and_shell_decorated_boneblock"), LAVA_AND_CHOCHOLATE_SOAKED_DIAMOND_AND_SHELL_DECORATED_BONEBLOCK);
        Registry.register(Registry.ITEM, new Identifier("eifl","lava_and_chocolate_soaked_diamond_and_shell_decorated_boneblock"), new BlockItem(LAVA_AND_CHOCHOLATE_SOAKED_DIAMOND_AND_SHELL_DECORATED_BONEBLOCK, new Item.Settings().group(Main.ITEM_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier("eifl","unfinished_end_portal_frame"),UNFINISHED_END_PORTAL_FRAME);
        Registry.register(Registry.ITEM, new Identifier("eifl","unfinished_end_portal_frame"), new BlockItem(UNFINISHED_END_PORTAL_FRAME, new Item.Settings().group(Main.ITEM_GROUP)));

        LOGGER.info("[EIFL]这是一个一个一个一个");
        LOGGER.info("[EIFL]一个一个一个MOD啊啊啊啊！");
    }
}
