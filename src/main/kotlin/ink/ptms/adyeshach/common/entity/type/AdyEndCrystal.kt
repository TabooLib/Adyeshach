package ink.ptms.adyeshach.common.entity.type

import ink.ptms.adyeshach.common.bukkit.data.PositionNull
import ink.ptms.adyeshach.common.entity.EntityTypes
import io.izzel.taboolib.module.nms.impl.Position

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
class AdyEndCrystal : AdyEntity(EntityTypes.END_CRYSTAL) {

    init {
        /*

        1.16,1.15,1.14
        7 ->Beam target
        8 ->Show bottom

        1.13,1.12,1.11,1.10
        6 ->Beam target
        7 ->Show bottom

        1.9
        5 ->Beam target
        6 ->Show bottom

         */
        registerMeta(at(11400 to 7, 11000 to 6, 10900 to 5), "beamTarget", PositionNull())
        registerMeta(at(11400 to 8, 11000 to 7, 10900 to 6), "showBottom", true)
    }

    fun setBeamTarget(position: Position?) {
        setMetadata("beamTarget", position ?: PositionNull())
    }

    fun getBeamTarget(): Position? {
        val position = getMetadata<Position>("beamTarget")
        return if (position is PositionNull) null else position
    }

    fun isShowBottom(): Boolean {
        return getMetadata("showBottom")
    }

    fun setShowBottom(showBottom: Boolean) {
        setMetadata("showBottom", showBottom)
    }
}