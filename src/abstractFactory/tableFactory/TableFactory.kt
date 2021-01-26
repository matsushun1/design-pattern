package abstractFactory.tableFactory

import abstractFactory.factory.Factory
import abstractFactory.factory.Link
import abstractFactory.factory.Page
import abstractFactory.factory.Tray

class TableFactory : Factory() {
    override fun createLink(caption: String, url: String): Link {
        TODO("Not yet implemented")
    }

    override fun createTray(caption: String): Tray {
        TODO("Not yet implemented")
    }

    override fun createPage(title: String, author: String): Page {
        TODO("Not yet implemented")
    }
}
