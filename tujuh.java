public class tujuh {
	public static void main(String[] args) {
		float awal=1;
		float akhir=30;
		float jumlah=0;
		float rata;

		System.out.println("rata-rata nilai awal"+awal);
		System.out.println("rata-rata nilai akhir"+akhir);
		while (awal<=akhir);{
			jumlah=jumlah+awal;
			awal++;
		}
		System.out.println(jumlah);
		rata=jumlah/akhir;
		System.out.println("jumlah rata-rata="+rata);

	}
	
}