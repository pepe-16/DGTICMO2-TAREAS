package Proyecto.Modulo2;

import Principios.Solid.Clase.DependencyInversion.*;

public class TestBudgetReport
{
    public static void main(String[] args) {
        BudgetReport budgetReport = new BudgetReport();
        budgetReport.save();
    }
}