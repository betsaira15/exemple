package com.company;


import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Main {

    public static void main(String[] args) {
        List<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", "USA", 600),
                new Phone("Pixel 2", "Google", "France", 300),
                new Phone("Pixel 4", "Google", "France", 600),
                new Phone("iPhone 8", "Apple", "Italy", 450),
                new Phone("Galaxy S9", "Samsung", "UA", 450),
                new Phone("Galaxy S10", "Samsung", "UA", 450),

                new Phone("Galaxy S8", "Samsung", "UA", 340),
                new Phone("Galaxy S8X", "Samsung", "UA", 340)
        ).collect(Collectors.toList());
//
//        Map<String, IntSummaryStatistics> phonesByCompany = phoneStream.collect(
//                Collectors.groupingBy(Phone::getCompany, Collectors.summarizingInt(Phone::getPrice)));
        //      List<Phone> phonesByCompany = phoneStream.stream().filter(x->x.getPrice()>0).collect(Collectors.toList());
//System.out.println(
//        phonesByCompany.stream().collect(Collectors.groupingBy(x->x.getCompany()))
//                .entrySet()
//                        .stream()
//        .map(m->String.format("%s +\n (%s)", m.getKey().toString(), m.getValue()
//                        .stream()
//                                .collect(Collectors.groupingBy(Phone::getCompany))
//                .entrySet()
//               //.keySet()
//                .stream()
//
//                                     .map(x->String.format("%s \t *\t (%s)",x.toString()))
//                                                  //   .stream()
//                       .collect(Collectors.toList())));
        //.collect(Collectors.joining("\n"))))));
        // System.out.println(phonesByCompany);
        //  .stream()
//                        .map(n->String.format("%s \t \t %s", m.getValue(), m.getKey()))
        // .collect(Collectors.joining("\n"))));
//                collect(Cox->llectors.groupingBy(Phone::getCompany));
//               phonesByCompany.entrySet().stream().collect(Collectors.groupingBy(Phone::getName)));
        //  Stream.collect(
//                Collectors.groupingBy(Phone::getCompany,
//                        Collectors.summarizingInt(Phone::getPrice)));

//        for (Map.Entry<String, IntSummaryStatistics> item : phonesByCompany.entrySet()) {
//
//            System.out.println(item.getKey() + " - " + item.getValue().getSum());
//        }

//        phonesByCompany.stream().map(emp -> String.format("%s \n %s", getKey(), emp.getValue()));
//        System.out.println(phonesByCompany.stream()
//                .collect(Collectors.groupingBy(x -> x.getKey())) + "\n");
        Map<String, List<Phone>> f = phoneStream.stream().collect(Collectors.groupingBy(Phone::getCompany));

        for (Map.Entry<String, List<Phone>> item : f.entrySet()) {
            Map<String, List<Phone>> f1 = phoneStream.stream().collect(Collectors.groupingBy(Phone::getCountry));

            for (Map.Entry<String, List<Phone>> item1 : f1.entrySet()) {
                Map<String, List<Phone>> f2 = phoneStream.stream().collect(Collectors.groupingBy(Phone::getName));
                System.out.println(" ■ " + item.getKey());
                for (Phone phone : item.getValue()) {

                    System.out.print("\t  •" + phone.getCountry() + "\n \t * " + phone.getName() + " - " + phone.getPrice() + "\n");
                }
                // System.out.println();

            }
        }

    }
}






