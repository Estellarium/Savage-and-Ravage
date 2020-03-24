package com.farcr.savageandravage.core.registry;

import com.farcr.savageandravage.common.item.SRArmorMaterial;
import com.farcr.savageandravage.core.SavageAndRavage;
import com.farcr.savageandravage.core.util.RegistryUtils;

import com.google.common.collect.Lists;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class SRItems {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SavageAndRavage.MODID);
	public static final List<RegistryObject<Item>> SPAWN_EGGS = Lists.newArrayList();

	public static RegistryObject<Item> BLAST_PROOF_PLATING = RegistryUtils.createItem("blast_proof_plating", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
	public static RegistryObject<Item> GRIEFER_HELMET = RegistryUtils.createItem("griefer_helmet", () -> new ArmorItem(SRArmorMaterial.GRIEFER, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> GRIEFER_CHESTPLATE = RegistryUtils.createItem("griefer_chestplate", () -> new ArmorItem(SRArmorMaterial.GRIEFER, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> GRIEFER_LEGGINGS = RegistryUtils.createItem("griefer_leggings", () -> new ArmorItem(SRArmorMaterial.GRIEFER, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	public static RegistryObject<Item> GRIEFER_BOOTS = RegistryUtils.createItem("griefer_boots", () -> new ArmorItem(SRArmorMaterial.GRIEFER, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static RegistryObject<Item> POULTRY_FARMING_HAT = RegistryUtils.createItem("poultry_farming_hat", () -> new Item(new Item.Properties().group(ItemGroup.TOOLS	)));
	
	public static RegistryObject<Item> CREEPER_SPORES = RegistryUtils.createItem("creeper_spores", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

	//public static RegistryObject<Item> CREEPIE_SPAWN_EGG = RegistryUtils.createSpawnEggItem("creepie", () -> SREntities.CREEPIE.get(), 86762142, 4561247, ItemGroup.MISC);
}
