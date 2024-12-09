package Model;

import javax.swing.JOptionPane;

public class CartStack {
    private static final int MAX_SIZE = 100;
    private CartItem[] items;
    private int top;
    
    public CartStack() {
        items = new CartItem[MAX_SIZE];
        top = -1;
    }
    
    public void push(CartItem newItem) {
        // Check if product already exists in cart
        for (int i = 0; i <= top; i++) {
            if (items[i] != null && 
                items[i].getProduct().getName().equals(newItem.getProduct().getName())) {
                // Product already exists, show message
                JOptionPane.showMessageDialog(null, 
                    "This item is already in your cart.\nYou can adjust the quantity in the cart page.");
                return;
            }
        }
        
        // If product doesn't exist, add it
        if (top < MAX_SIZE - 1) {
            items[++top] = newItem;
            JOptionPane.showMessageDialog(null, "Added to cart successfully!");
        }
    }
    
    public CartItem pop() {
        if (!isEmpty()) {
            return items[top--];
        }
        return null;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public CartItem[] getAllItems() {
        CartItem[] result = new CartItem[top + 1];
        System.arraycopy(items, 0, result, 0, top + 1);
        return result;
    }

} 