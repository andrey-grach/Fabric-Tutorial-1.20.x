package net.laneboyandrew.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.laneboyandrew.tutorialmod.TutorialMod;
import net.laneboyandrew.tutorialmod.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .entries(((displayContext, entries) -> {
//                        items
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(Items.DIAMOND_AXE);
//                        blocks
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.SOUND_BLOCK);
                    })).build()

    );

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
