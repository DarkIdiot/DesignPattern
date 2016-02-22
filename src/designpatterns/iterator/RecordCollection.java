package designpatterns.iterator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:14:58
 */
public class RecordCollection implements IContainer {

	private String recordArray[] = { "first", "second", "third", "fourth",
			"fifth" };

	@Override
	public IIterator createIterator() {
		RecordIterator iterator = new RecordIterator();
		return iterator;
	}

	private class RecordIterator implements IIterator {
		private int index;

		public boolean hasNext() {
			if (index < recordArray.length)
				return true;
			else
				return false;
		}

		public Object next() {
			if (this.hasNext())
				return recordArray[index++];
			else
				return null;
		}
	}
}
