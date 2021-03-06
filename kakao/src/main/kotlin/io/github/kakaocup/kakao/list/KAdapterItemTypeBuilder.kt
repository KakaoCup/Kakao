@file:Suppress("unused")

package io.github.kakaocup.kakao.list

import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.KakaoDslMarker
import kotlin.reflect.KClass

/**
 * Class that maps types to providing functions
 *
 * To be able to support different item types in KListView, this class
 * adds support for mapping item type classes to functions that provide them.
 * KEmptyAdapterItem is added by default.
 *
 * @see itemType
 * @see KEmptyAdapterItem
 */
@KakaoDslMarker
class KAdapterItemTypeBuilder {
    val itemTypes = mutableMapOf<KClass<out KAdapterItem<*>>, KAdapterItemType<KAdapterItem<*>>>()

    init {
        itemTypes.put(KAdapterItem::class, KAdapterItemType { interaction -> KEmptyAdapterItem(interaction) })
        itemTypes.put(KEmptyAdapterItem::class, KAdapterItemType { interaction -> KEmptyAdapterItem(interaction) })
    }

    /**
     * Adds entry that helps KListView to automatically build child views
     *
     * To make it work, you need to pass here function (lambda, constructor), that takes matcher and returns
     * instance of your item type. In this case, matcher actually matches your KListView and additional
     * matchers that were used (in firstChild(), childAt(), etc.)
     *
     * @param provideItem Function that takes data interaction of list view and returns instance of item view
     */
    inline fun <reified T : KAdapterItem<*>> itemType(noinline provideItem: (DataInteraction) -> T) {
        itemTypes.put(T::class, KAdapterItemType(provideItem))
    }
}
