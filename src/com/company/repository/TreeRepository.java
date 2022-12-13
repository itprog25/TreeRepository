package com.company.repository;

import com.company.tree.Tree;

import java.util.ArrayList;
import java.util.spi.AbstractResourceBundleProvider;

public class TreeRepository {

    private ArrayList<Tree> list = new ArrayList<>();

    public TreeRepository() {

    }

    public void add(Tree tree) {
        list.add(tree);
    }

    public void printAll() {
        for (Tree tree : list) {
            System.out.print("Azonosító: " + tree.getId() + ", ");
            System.out.print("Név: " + tree.getName() + " ");
            System.out.print("Típus: " + tree.getType() + " ");
            System.out.print("Év: " + tree.getYear() + " ");
            System.out.println();
        }
    }

    public void printOneTypeById(Long id) {
        boolean hasThatId= false;
        for (Tree tree : list) {
            if (tree.getId().equals(id)) {
                System.out.print("Típus:Tölgyfa");
                hasThatId= true;
                break;
            }
        }
        if (!hasThatId) {
            System.out.print("Nincs ilyen azonosítójú elem");
        }
    }
}
