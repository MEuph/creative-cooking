package dev.chrismharris.creative_cooking.item;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ExampleItem extends Item {
    public static final Item.Properties PROPERTIES = new Item.Properties().tab(CreativeCookingMod.CC_TAB);

    private ExampleItem(Properties properties) {
        super(properties);
    }

    public ExampleItem() {
        super(ExampleItem.PROPERTIES);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if (!world.isClientSide()) {
            System.out.println(player.getName().getString() + " has used item with hand " + hand.name());
        }

        return super.use(world, player, hand);
    }
}
