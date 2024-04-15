fun main (args: Array<String>) {
    val listView = ListView(arrayOf("Name 1", "Name 2", "Name 3", "Name 4"))

    listView.ListViewItem("zero").displayItem(0)
    listView.ListViewItem("one").displayItem(1)
    listView.ListViewItem("two").displayItem(2)
    listView.ListViewItem("three").displayItem(3)
}

class ListView ( val items: Array<String>) {
    inner class ListViewItem(val place: String) {
        fun displayItem(position: Int) {
            println("Item index $place = ${items[position]}")
        }
    }
}