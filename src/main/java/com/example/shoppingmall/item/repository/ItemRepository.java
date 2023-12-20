package com.example.shoppingmall.item.repository;

import com.example.shoppingmall.item.domain.Item;
import com.example.shoppingmall.item.domain.ItemPhotos;
import com.example.shoppingmall.item.domain.ItemStock;
import java.util.List;

public interface ItemRepository {

    void saveItem(Item item);

    void saveItemPhotos(ItemPhotos itemPhotos);

    void saveItemStock(ItemStock itemStock);

    List<Item> findAllItems();

    List<ItemStock> joinItemByItemNo(Long itemNo);

    Item findItemByNo(Long itemNo);

    List<ItemStock> findItemStocksByItemNo(Long itemNo);

    List<Item> findItemsByName(String itemName);

    List<Item> findAllItemsOnsale();

    List<Item> findAllItemsOffmarket();

    void updateItemByNo(Item item);

    void deleteItemByNo(Item item);

    void deleteItemByName(Item item);


    void deleteItemPhotosByNo(ItemPhotos itemPhotos);

    void deleteItemStockByStockNo(ItemStock itemStock);
}
