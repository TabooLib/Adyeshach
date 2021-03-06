package ink.ptms.adyeshach.api.event

import ink.ptms.adyeshach.common.entity.EntityInstance
import io.izzel.taboolib.module.event.EventCancellable
import org.bukkit.Bukkit

/**
 * @Author sky
 * @Since 2020-08-14 19:21
 */
class AdyeshachEntityTickEvent(val entity: EntityInstance) : EventCancellable<AdyeshachEntityTickEvent>() {

    init {
        async(!Bukkit.isPrimaryThread())
    }
}