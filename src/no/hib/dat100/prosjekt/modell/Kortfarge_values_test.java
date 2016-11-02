package no.hib.dat100.prosjekt.modell;

public class Kortfarge_values_test {

	public static void main(String[] args) {
		Kortfarge [] fg = new Kortfarge[4];
		for (int i = 0; i < Kortfarge.values().length; i++) {
			System.out.println(Kortfarge.values()[i]);
		}
		System.out.println(Kortfarge.values().length);
	}

}
