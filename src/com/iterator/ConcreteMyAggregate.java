package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 周
 * @title ConcreteMyAggregate
 * @date 2020/6/12 18:50
 * @description 自定义的聚合类
 */
public class ConcreteMyAggregate {

    private List<Object> list = new ArrayList<>();


    public void addObject(Object o) {
        list.add(o);
    }

    public void removerObject(Object o) {
        list.remove(o);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator createIterator(){
        return new ConcreteIterator();
    }

    /**
     * 使用内部类定义迭代器，可以直接使用外部类的属性
     */
    private class ConcreteIterator implements MyIterator {

        private int cursor; // 定义游标用于记录遍历的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size())
                cursor++;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size();
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }
}
