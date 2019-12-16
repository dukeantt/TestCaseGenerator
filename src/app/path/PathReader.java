package app.path;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class PathReader {
    public ArrayList<Branch> read(String pathFile) {
        ArrayList<Branch> branches = new ArrayList<>();
        ArrayList<String> paths = new ArrayList<>();
        try {
            File fileContainsPath = new File(pathFile);
            Scanner myReader = new Scanner(fileContainsPath);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ArrayList<Integer> nodeData = reverse_transform(data.split(":|\\s+"));
                Branch b = arr2Branch(nodeData);
                branches.add(b);
                paths.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        filterBranch(branches);
        paths.forEach(System.out::println);
        branches.forEach(System.out::println);

        return branches;
    }

    private ArrayList<Integer> reverse_transform(String[] arr) {
        ArrayList<Integer> reverseTransformResult = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("")) {
                continue;
            }
            reverseTransformResult.add(Integer.parseInt(arr[i]));
        }
        return reverseTransformResult;
    }

    private Branch arr2Branch(ArrayList<Integer> a) {
        Branch b = new Branch();
        for (Integer s : a) {
            Node n = new Node(s);
            b.add(n);
        }
        return b;
    }

    private void filterBranch(ArrayList<Branch> branches) {
        i:
        for (int i = 0; i < branches.size() - 1; i++) {
            Set<Integer> setI = branches.get(i).toSet();
            if (branches.get(i) == null) {
                continue;
            }
            for (int j = i + 1; j < branches.size(); j++) {
                if (branches.get(j) == null) {
                    continue;
                }
                Set<Integer> setJ = branches.get(j).toSet();
                if (setI.containsAll(setJ)) {
                    branches.set(j, null);
                }
                if (setJ.containsAll(setI)) {
                    branches.set(i, null);
                    continue i;
                }
            }
        }
        branches.removeIf(Objects::isNull);

    }
}
