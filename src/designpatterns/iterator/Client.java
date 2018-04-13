package designpatterns.iterator;

/**
 * @author idiot
 * @version 1.0
 * @date 2015年12月6日 下午11:15:52
 */
public class Client {
    public static void main(String[] args) {
        RecordCollection recordCollection = new RecordCollection();
        IIterator iter = recordCollection.createIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

interface IContainer {

    /**
     * 生成迭代器接口
     *
     * @return
     */
    IIterator createIterator();
}

interface IIterator {
    /**
     * 是否还有下一个
     *
     * @return
     */
    boolean hasNext();

    /**
     * 下一个元素
     *
     * @return
     */
    Object next();
}

class RecordCollection implements IContainer {

    private String recordArray[] = {"first", "second", "third", "fourth",
            "fifth"};

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
