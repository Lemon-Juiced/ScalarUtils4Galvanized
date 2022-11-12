package lemon_juice.galvanized.item.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DataTags {
    public static final TagKey<Block> WITH_BORE = BlockTags.create(new ResourceLocation("minecraft:mineable/bore.json"));
    public static final TagKey<Block> WITH_EXCAVATOR = BlockTags.create(new ResourceLocation("minecraft:mineable/excavator"));
    public static final TagKey<Block> WITH_HAMMER = BlockTags.create(new ResourceLocation("minecraft:mineable/hammer"));
    public static final TagKey<Block> WITH_LUMBERAXE = BlockTags.create(new ResourceLocation("minecraft:mineable/lumberaxe"));

    public static void setup(){
        //Method call or no work?
    }
}