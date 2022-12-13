package com.company;

import com.company.repository.TreeRepository;
import com.company.tree.Tree;

public class Main {
    public static void main(String[] args) {
        TreeRepository woodRepository = new TreeRepository();
        Tree tree = new Tree();
        tree.setId(2L);
        tree.setYear(25);
        tree.setName("Tölgyi,");
        tree.setType("Tölgyfa,");

        Tree secondtree = new Tree();
        secondtree.setId(27L);
        secondtree.setYear(23);
        secondtree.setName("Nemij,");
        secondtree.setType("Luc,");

        Tree thirdtree = new Tree();
        thirdtree.setId(4L);
        thirdtree.setYear(33);
        thirdtree.setName("BikkBakk,");
        thirdtree.setType("Fenyő,");

        woodRepository.add(tree);
        woodRepository.add(secondtree);
        woodRepository.add(thirdtree);
        woodRepository.printAll();
        woodRepository.printOneTypeById(2L);

    }
}