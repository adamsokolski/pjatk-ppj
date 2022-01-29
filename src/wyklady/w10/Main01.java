package wyklady.w10;

import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        String[] months = {"Sty", "Lut", "Mar", "Kwi", "Maj", "Cze"};
        int[] days = {31, 28, 31, 30, 31, 30, 31};

        for(int i = 0; i < months.length; i++) {
            System.out.println(months[i]+" - "+days[i]);


        }

        //==============================================

        Month[] tab = new Month[12];
        int elementsCount = 0;

        for (int i = 0; i < months.length; i++) {
            if(i == 1)
                tab[i] = new Month(months[i], days[i], true);
            else
                tab[i] = new Month(months[i], days[i]);
            elementsCount++;
        }

        for (int i = 0; i < elementsCount; i++) {
            System.out.println(tab[i].getData());
        }

        //==============================================

        ListElement head = null;

        for (int i = 0; i < months.length; i++) {
            ListElement temp = new ListElement();
            temp.month = new Month(months[i], days[i]);
            temp.next = head;
            head = temp;
        }
        System.out.println("=================");
        ListElement tmp = head;
        while(tmp != null) {
            System.out.println(tmp.month.getData());
            tmp = tmp.next;
        }

        //==============================================

        MyList list = new MyList();
        for (int i = 0; i < months.length; i++) {
            list.addMonth(
                new Month(months[i], days[i])
            );
        }

        list.show();

        //==============================================
        MyList list2 = new MyList();
        for (int i = 0; i < months.length; i++) {
            list2.addLastElement(
                    new Month(months[i], days[i])
            );
        }

        list2.show();

    }
}
