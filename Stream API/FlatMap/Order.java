package flatmap;

import java.awt.List;

public class Order {
	  private String orderId;
	  private List items;
	  public String getOrderId() {
	    return orderId;
	  }
	  public void setOrderId(String orderId) {
	    this.orderId = orderId;
	  }
	  public List getItems() {
	    return items;
	  }
	  public void setItems(List items) {
	    this.items = items;
	  }
	}
