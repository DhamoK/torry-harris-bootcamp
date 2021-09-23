package com.torryharris.drive;

import com.torryharris.model.*;

public class CarTypesDemo {
    public static void main(String[] args) {
        Tyre tvs = new Tyre("TVS", 16.25);
        Tyre appolo = new Tyre("APPOLO", 17.25);
        MusicSystem sony = new MusicSystem("Sony", 7, true, 12);
        HatchBack swift = new HatchBack("SWIFT", "DIESEL", 1800, 5, 45.5, tvs, sony, "Power");
        swift.displayHatchBackFeatures();
        Sedan aspire = new Sedan("Aspire","PETROL",1800, 5, 45.5, appolo, sony, 450);
        aspire.setBootSpace(520);
        aspire.displaySedanFeatures();
        Suv nexon = new Suv("Nexon","PETROL",1900, 5, 42.5, appolo, sony,"ECO",true);
        nexon.displaySuvFeatures();

    }
}

