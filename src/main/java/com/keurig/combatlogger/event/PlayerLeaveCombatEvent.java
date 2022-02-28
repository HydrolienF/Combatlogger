package com.keurig.combatlogger.event;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class PlayerLeaveCombatEvent extends Event {

    /**
     * Get the player who left combat
     */
    private final Player player;

    private static final HandlerList HANDLERS = new HandlerList();

    /*
      This event fires twice
     */
    public PlayerLeaveCombatEvent(Player player) {
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
