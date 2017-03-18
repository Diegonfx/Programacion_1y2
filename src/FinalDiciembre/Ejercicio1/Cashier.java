package FinalDiciembre.Ejercicio1;

import java.time.LocalDate;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Cashier {

    private LocalDate vehicleControlDate = LocalDate.now();
    public LocalDate getVehicleControlDate() {
        return vehicleControlDate;
    }

    public double getPricePerMonth(Case anyCase) {

        double price = 0;
        if (anyCase.getaType().isExtraJudicial()) {
            price += 1000;
        } else if (anyCase.getaType().isMediacion()) {
            price += 2000;
        } else {
            price += 5000;
        }
        if (anyCase.getHearings().size() >= 1) {
            for (Hearing anyHearing : anyCase.getHearings()) {
                if (anyHearing.getHearingDate().getMonth() == getVehicleControlDate().getMonthValue())
                price += 150;
            }
        } for (Case theCase: anyCase.getLawyer().getCases()) {
            if (theCase.isCaseIsClosed() && theCase.getFinishingDate().getMonth() == getVehicleControlDate().getMonthValue()) {
                price += 2000;
            }
        } return price;
    }

    public void depositHonoraries(Lawyer anyLawyer) {
        for (Case anyCase : anyLawyer.getCases()) {
            double pricePerMonth  = getPricePerMonth(anyCase);
            anyLawyer.addMoneyToBankAccount(pricePerMonth);
        }
    }



}
