package ink.ptms.adyeshach.common.entity.type.impl

import ink.ptms.adyeshach.common.entity.type.EntityTypes
import ink.ptms.adyeshach.api.nms.NMS
import org.bukkit.entity.Player

/**
 * @Author sky
 * @Since 2020-08-04 18:28
 */
abstract class AdyFish(owner: Player, entityTypes: EntityTypes) : AdyEntityLiving(owner, entityTypes) {

    init {
        registerMeta(15, "fromBucket", false)
    }

    fun setFromBucket(value: Boolean) {
        setMetadata("fromBucket", value)
    }

    fun isFromBucket(): Boolean {
        return getMetadata("fromBucket")
    }
}