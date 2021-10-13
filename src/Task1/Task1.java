package Task1;

    final public class Task1 {
        public static void main(final String[] args)
        {
            final String[] arrayString = { "pig","horse","owner","champion","department"};
            String arrayTemporary;
            for (int i=0; i<arrayString.length-1; i++)
                for (int j=i; j>=0; j--)
                    if (arrayString[j].length()>arrayString[j+1].length())
                    {
                        arrayTemporary = arrayString[j];
                        arrayString[j] = arrayString[j+1];
                        arrayString[j+1] = arrayTemporary;
                    }
            for (int i=0; i<arrayString.length; i++)
                System.out.println(arrayString[i]);
        }
    }

