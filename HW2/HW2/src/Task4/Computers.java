package Task4;

import Task4.Shop;

public class Computers implements Shop {

    private String[] computers;
    private int size;


    public Computers(int size) {
        this.size = size;
        computers = new String[size];
        for(int ind = 0; ind < computers.length; ++ind) {
            computers[ind] = "";
        }
    }
    public void find(String requestName) {
        for(int ind = 0; ind < computers.length; ++ind) {
            if(computers[ind].equals(requestName)) {
                System.out.println("Your request has " + (ind + 1) + " number.");
                break;
            }
        }
    }
    public void add(String addName) {
        for(int ind = 0; ind < computers.length; ++ind) {
            if(computers[ind].isEmpty()) {
                computers[ind] = addName;
                break;
            }
        }
    }

    public void delete(String deleteName) {
        for(int ind = 0; ind < computers.length; ++ind) {
            if(computers[ind].equals(deleteName)) {
                computers[ind] = "";
                for(int jnd = ind; jnd < computers.length; ++jnd) {
                    if(jnd + 1 < computers.length) {
                        computers[jnd] = computers[jnd + 1];
                    } else {
                        computers[jnd] = "";
                        break;
                    }
                }
                break;
            }
        }
    }
    public void showAllComputers() {
        for(String ind : computers) System.out.println(ind + " ");
    }
}
