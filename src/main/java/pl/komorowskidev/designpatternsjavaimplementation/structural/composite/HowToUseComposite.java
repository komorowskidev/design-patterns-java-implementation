package pl.komorowskidev.designpatternsjavaimplementation.structural.composite;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseComposite implements HowToUse {

    @Override
    public void use() {
        System.out.println("COMPOSITE");

        Department szczecinBranch1 = new Leaf("Branch1", 20_000);
        Department szczecinBranch2 = new Leaf("Branch2", 15_000);
        Composite szczecin = new Composite("Szczecin", 2_000);
        szczecin.addDepartment(szczecinBranch1);
        szczecin.addDepartment(szczecinBranch2);

        Department poznanBranch1 = new Leaf("Branch1", 10_000);
        Department poznanBranch2 = new Leaf("Branch2", 20_000);
        Department poznanBranch3 = new Leaf("Branch3", 25_000);
        Composite poznan = new Composite("Poznan", 1_000);
        poznan.addDepartment(poznanBranch1);
        poznan.addDepartment(poznanBranch2);
        poznan.addDepartment(poznanBranch3);

        Department gdanskBranch1 = new Leaf("Branch1", 30_000);
        Department gdanskBranch2 = new Leaf("Branch2", 15_000);
        Composite gdansk = new Composite("Gdansk", 4_000);
        gdansk.addDepartment(gdanskBranch1);
        gdansk.addDepartment(gdanskBranch2);

        Department warszawaBranch1 = new Leaf("Branch1", 10_000);
        Department warszawaBranch2 = new Leaf("Branch2", 5_000);
        Department warszawaBranch3 = new Leaf("Branch3", 35_000);
        Department warszawaBranch4 = new Leaf("Branch4", 15_000);
        Composite warszawa = new Composite("Warszawa", 5_000);
        warszawa.addDepartment(warszawaBranch1);
        warszawa.addDepartment(warszawaBranch2);
        warszawa.addDepartment(warszawaBranch3);
        warszawa.addDepartment(warszawaBranch4);

        Composite westDistrict = new Composite("West", 4_000);
        westDistrict.addDepartment(szczecin);
        westDistrict.addDepartment(poznan);

        Composite eastDistrict = new Composite("East", 5_000);
        eastDistrict.addDepartment(gdansk);
        eastDistrict.addDepartment(warszawa);

        Composite pekBank = new Composite("Pek Bank", 20_000);
        pekBank.addDepartment(westDistrict);
        pekBank.addDepartment(eastDistrict);

        System.out.println(szczecin.getName());
        System.out.println("daily profit sum: " + szczecin.getProfit());
        System.out.println();
        System.out.println(pekBank.getName());
        System.out.println("daily profit sum: " + pekBank.getProfit());
    }
}
