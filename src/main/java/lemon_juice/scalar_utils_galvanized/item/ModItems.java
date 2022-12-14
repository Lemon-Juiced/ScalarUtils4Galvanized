package lemon_juice.scalar_utils_galvanized.item;

import lemon_juice.scalar_utils_galvanized.ScalarUtilsGalvanized;
import lemon_juice.scalar_utils_galvanized.creativetab.ModCreativeModeTab;
import lemon_juice.scalar_utils_galvanized.item.custom.BoreItem;
import lemon_juice.scalar_utils_galvanized.item.custom.ExcavatorItem;
import lemon_juice.scalar_utils_galvanized.item.custom.HammerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtilsGalvanized.MOD_ID);

    //Bores: 5x5 (Excavators + Hammers)
    public static final RegistryObject<Item> WOODEN_BORE = ITEMS.register("wooden_bore", () -> new BoreItem(Tiers.WOOD, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(354), 2));
    public static final RegistryObject<Item> STONE_BORE = ITEMS.register("stone_bore", () -> new BoreItem(Tiers.STONE, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(786), 2));
    public static final RegistryObject<Item> IRON_BORE = ITEMS.register("iron_bore", () -> new BoreItem(Tiers.IRON, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(1500), 2));
    public static final RegistryObject<Item> GOLDEN_BORE = ITEMS.register("golden_bore", () -> new BoreItem(Tiers.GOLD, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(192), 2));
    public static final RegistryObject<Item> DIAMOND_BORE = ITEMS.register("diamond_bore", () -> new BoreItem(Tiers.DIAMOND, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(9384), 2));
    public static final RegistryObject<Item> NETHERITE_BORE = ITEMS.register("netherite_bore", () -> new BoreItem(Tiers.NETHERITE, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(12186), 2));

    //Excavators: 3x3 Shovel
    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator", () -> new ExcavatorItem(Tiers.WOOD, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(177), 1));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator", () -> new ExcavatorItem(Tiers.STONE, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(393), 1));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator", () -> new ExcavatorItem(Tiers.IRON, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(750), 1));
    public static final RegistryObject<Item> GOLDEN_EXCAVATOR = ITEMS.register("golden_excavator", () -> new ExcavatorItem(Tiers.GOLD, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(96), 1));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator", () -> new ExcavatorItem(Tiers.DIAMOND, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(4692), 1));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator", () -> new ExcavatorItem(Tiers.NETHERITE, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(6093), 1));

    //Hammers: 3:3 Pickaxe
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer", () -> new HammerItem(Tiers.WOOD, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(177), 1));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", () -> new HammerItem(Tiers.STONE, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(393), 1));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", () -> new HammerItem(Tiers.IRON, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(750), 1));
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer", () -> new HammerItem(Tiers.GOLD, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(96), 1));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", () -> new HammerItem(Tiers.DIAMOND, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(4692), 1));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer", () -> new HammerItem(Tiers.NETHERITE, new Item.Properties().tab(ModCreativeModeTab.GALVANIZED_TAB).durability(6093), 1));

    //Lumberaxes: Chops Down Whole Tree
    //TO DO

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
