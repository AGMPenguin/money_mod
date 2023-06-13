package com.agmpenguin.money.event;

import com.agmpenguin.money.Money;
import com.agmpenguin.money.item.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.*;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = Money.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvents {
    static int check = 0;
    static float rand = 0;
    static double x, y, z;
    static Level level;
    @SubscribeEvent
    public static void livingDeathEvent(LivingDeathEvent event) {
        if(check == 0) {
            check++;
            Entity entity = event.getEntity();
            level = entity.level();
            x = entity.getX();
            y = entity.getY();
            z = entity.getZ();
            if (event.getSource().getEntity() instanceof Player) {
                if(entity instanceof Blaze) {                                                               // Shift Shift, Ctrl+h hierarchy, middleButton declaration
                    spawnItem(4, 18, 27);
                } else if(entity instanceof CaveSpider) {
                    spawnItem(4, 5, 9);
                } else if(entity instanceof Creeper) {
                    spawnItem(4, 11, 16);
                } else if(entity instanceof Drowned) {
                    spawnItem(4, 6, 13);
                } else if(entity instanceof ElderGuardian) {
                    spawnItem(6, 74, 98);
                } else if(entity instanceof EnderDragon) {
                    spawnItem(6, 28000, 40000);
                } else if(entity instanceof EnderMan) {
                    spawnItem(4, 25, 32);
                } else if(entity instanceof Endermite) {
                    spawnItem(4, 0, 2);
                } else if(entity instanceof Evoker) {
                    spawnItem(4, 26, 35);
                } else if(entity instanceof Ghast) {
                    spawnItem(4, 22, 30);
                } else if(entity instanceof Giant) {
                    spawnItem(4, 89, 164);
                } else if(entity instanceof Guardian) {
                    spawnItem(4, 42, 54);
                } else if(entity instanceof Hoglin) {
                    spawnItem(4, 37, 63);
                } else if(entity instanceof Husk) {
                    spawnItem(4, 6, 13);
                } else if(entity instanceof Illusioner) {
                    spawnItem(5, 47, 61);
                } else if(entity instanceof MagmaCube) {
                    spawnItem(4, 2, 5);
                } else if(entity instanceof  Phantom) {
                    spawnItem(4, 4, 8);
                } else if(entity instanceof  Piglin) {
                    spawnItem(4, 4, 9);
                } else if(entity instanceof PiglinBrute) {
                    spawnItem(4, 23, 31);
                } else if(entity instanceof Pillager) {
                    spawnItem(4, 14, 24);
                } else if(entity instanceof Ravager) {
                    spawnItem(4, 31, 50);
                } else if(entity instanceof Shulker) {
                    spawnItem(4, 18, 32);
                } else if(entity instanceof Silverfish) {
                    spawnItem(4, 0, 2);
                } else if(entity instanceof Skeleton) {
                    spawnItem(4, 6, 12);
                } else if(entity instanceof SkeletonHorse) {
                    spawnItem(4, 15, 43);
                } else if(entity instanceof Slime) {
                    spawnItem(4, 2, 4);
                } else if(entity instanceof Spider) {
                    spawnItem(4, 4, 10);
                } else if(entity instanceof Stray) {
                    spawnItem(4, 6, 14);
                } else if(entity instanceof Vex) {
                    spawnItem(4, 5, 16);
                } else if(entity instanceof Vindicator) {
                    spawnItem(4, 17, 36);
                } else if(entity instanceof Witch) {
                    spawnItem(4, 30, 46);
                } else if(entity instanceof WitherBoss) {
                    spawnItem(6, 52000, 63000);
                } else if(entity instanceof WitherSkeleton) {
                    spawnItem(4, 54, 74);
                } else if(entity instanceof Zoglin) {
                    spawnItem(4, 42, 67);
                } else if(entity instanceof Zombie) {
                    if(entity instanceof ZombifiedPiglin) {
                        spawnItem(4, 3, 7);
                    } else if(entity instanceof ZombieVillager) {
                        spawnItem(4, 5, 12);
                    } else {
                        spawnItem(4, 3, 7);
                    }
                } else if(entity instanceof ZombieHorse) {
                    spawnItem(4, 76, 200);
                }
            } else if(!(event.getSource().getEntity() == null)) {
                if(entity instanceof Blaze) {                                                               // Shift Shift, Ctrl+h hierarchy, middleButton declaration
                    spawnItem(1, 16, 23);
                } else if(entity instanceof CaveSpider) {
                    spawnItem(1, 4, 6);
                } else if(entity instanceof Creeper) {
                    spawnItem(1, 7, 12);
                } else if(entity instanceof Drowned) {
                    spawnItem(1, 4, 9);
                } else if(entity instanceof ElderGuardian) {
                    spawnItem(6, 70, 86);
                } else if(entity instanceof EnderDragon) {
                    spawnItem(6, 25000, 32000);
                } else if(entity instanceof EnderMan) {
                    spawnItem(1, 20, 27);
                } else if(entity instanceof Endermite) {
                    spawnItem(1, 0, 1);
                } else if(entity instanceof Evoker) {
                    spawnItem(1, 23, 28);
                } else if(entity instanceof Ghast) {
                    spawnItem(1, 15, 24);
                } else if(entity instanceof Giant) {
                    spawnItem(1, 63, 102);
                } else if(entity instanceof Guardian) {
                    spawnItem(1, 36, 47);
                } else if(entity instanceof Hoglin) {
                    spawnItem(1, 24, 43);
                } else if(entity instanceof Husk) {
                    spawnItem(1, 5, 8);
                } else if(entity instanceof Illusioner) {
                    spawnItem(4, 36, 49);
                } else if(entity instanceof MagmaCube) {
                    spawnItem(1, 0, 3);
                } else if(entity instanceof  Phantom) {
                    spawnItem(1, 3, 5);
                } else if(entity instanceof  Piglin) {
                    spawnItem(1, 2, 5);
                } else if(entity instanceof PiglinBrute) {
                    spawnItem(1, 14, 25);
                } else if(entity instanceof Pillager) {
                    spawnItem(1, 10, 20);
                } else if(entity instanceof Ravager) {
                    spawnItem(1, 25, 37);
                } else if(entity instanceof Shulker) {
                    spawnItem(1, 16, 23);
                } else if(entity instanceof Silverfish) {
                    spawnItem(1, 0, 1);
                } else if(entity instanceof Skeleton) {
                    spawnItem(1, 4, 9);
                } else if(entity instanceof SkeletonHorse) {
                    spawnItem(1, 10, 20);
                } else if(entity instanceof Slime) {
                    spawnItem(1, 0, 3);
                } else if(entity instanceof Spider) {
                    spawnItem(1, 3, 6);
                } else if(entity instanceof Stray) {
                    spawnItem(1, 5, 9);
                } else if(entity instanceof Vex) {
                    spawnItem(1, 4, 9);
                } else if(entity instanceof Vindicator) {
                    spawnItem(1, 12, 23);
                } else if(entity instanceof Witch) {
                    spawnItem(1, 27, 34);
                } else if(entity instanceof WitherBoss) {
                    spawnItem(6, 47000, 59000);
                } else if(entity instanceof WitherSkeleton) {
                    spawnItem(1, 42, 57);
                } else if(entity instanceof Zoglin) {
                    spawnItem(1, 30, 47);
                } else if(entity instanceof Zombie) {
                    if(entity instanceof ZombifiedPiglin) {
                        spawnItem(1, 2, 5);
                    } else if(entity instanceof ZombieVillager) {
                        spawnItem(1, 2, 7);
                    } else {
                        spawnItem(1, 2, 5);
                    }
                } else if(entity instanceof ZombieHorse) {
                    spawnItem(1, 50, 100);
                }
            }
        } else {
            check = 0;
        }
    }

    private static void spawnItem(int chance, int min, int max) {
        spawnItem(6, chance, min, max);
    }

    private static void spawnItem(int options, int chance, int min, int max) {
        Random rand = new Random();
        int i = rand.nextInt(options);
        i += 1;
        if (i <= chance) {
            Random rand2 = new Random();
            int money = rand2.nextInt((max + 1 - min));
            money += min;
            money = Math.floorDiv((money/4*3), 1);
            print(money);

            int hundredsIn;
            for(hundredsIn = 0; hundredsIn < (money-(money%100))/100; hundredsIn++) {
                addItem(ModItems.ONE_HUNDRED_DOLLARS.get());
            }
            money = money - hundredsIn * 100;
            print(hundredsIn);
            print(money);

            int fiftiesIn;
            for(fiftiesIn = 0; fiftiesIn < (money-(money%50))/50; fiftiesIn++) {
                addItem(ModItems.ONE_HUNDRED_DOLLARS.get());
            }
            money = money - fiftiesIn * 50;
            print(fiftiesIn);
            print(money);

            int tensIn;
            for(tensIn = 0; tensIn < (money-(money%10))/10; tensIn++) {
                addItem(ModItems.TEN_DOLLARS.get());
            }
            money = money - tensIn * 10;
            print(tensIn);
            print(money);

            int fivesIn;
            for(fivesIn = 0; fivesIn < (money-(money%5))/5; fivesIn++) {
                addItem(ModItems.FIVE_DOLLARS.get());
            }
            money = money - fivesIn * 5;
            print(fivesIn);
            print(money);

            int onesIn;
            for(onesIn = 0; onesIn < money; onesIn++) {
                addItem(ModItems.ONE_DOLLAR.get());
            }
            money = money - onesIn;
            print(onesIn);
            print(money);
        }
    }

    private static void addItem(Item item) {
        ItemEntity itemEntity = new ItemEntity(level, x, y, z, new ItemStack(item));
        itemEntity.setPickUpDelay(10);
        level.addFreshEntity(itemEntity);
    }

    private static void print(int text) {
        System.out.println("UNLADEN SWALLOW: " + text);
    }
}