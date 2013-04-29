package pl.iogreen.tutorial.addressbook

import com.vaadin.server.VaadinRequest
import com.vaadin.ui._

/**
 * User: blazej
 * Date: 4/29/13
 * Time: 9:28 PM
 */
class MyVaadinUI extends UI {

  override def init(request: VaadinRequest) {
    val layout = new VerticalLayout()
    layout.setMargin(true)
    setContent(layout)
  }
}
