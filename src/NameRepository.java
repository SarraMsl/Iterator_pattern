public class NameRepository implements Container{
    public String  names[]={"Sarra","Salim","Saliha","Omar"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    public class NameIterator implements Iterator{
        int position=0;
        @Override
        public boolean hasNext() {
         if(position<names.length)   {
          return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()){
                return names[position++];
            }
            return null;
        }
    }
}
