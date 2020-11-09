package de.smartsquare

class CountingSet : HashSet<Long>() {

    private var _addedElements: Long = 0;

    val addedElements: Long get() = _addedElements

    override fun add(element: Long): Boolean {
        _addedElements++

        return super.add(element)
    }

    override fun addAll(elements: Collection<Long>): Boolean {
        _addedElements += elements.size

        return super.addAll(elements)
    }
}
