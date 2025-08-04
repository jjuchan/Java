package basic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니에 담긴 아이템:");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("아이템 이름: " + item.getName() + ", 총 가격: " + item.getTotalPrice());
        }
        if (itemCount == 0) {
            System.out.println("장바구니가 비어 있습니다.");
        }
    }
}
