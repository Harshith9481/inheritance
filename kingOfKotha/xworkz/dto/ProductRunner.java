package com.kingOfKotha.xworkz.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

public class ProductRunner {

	public static void main(String[] args) {
	
		ProductDTO dtos = new ProductDTO(1, "Juice", 10, LocalDate.of(2010,11 , 10), LocalDate.of(2010,2 , 10), 10, "good tasty", "200ml", 5, 100, 5, 3, 2, 1, 4, "Harshi", "250gms", "sugar,dioxide,corbon", "Fruti",  LocalDate.of(2021, 10, 18), "karnataka", false, "India", "fgh45678", "jkl78", false, "No Warranty", LocalDate.of(2013, 10, 11), LocalDate.of(2022, 8, 18),LocalDate.of(2023,8, 11));
		

		ProductDTO dtos1 = new ProductDTO(2, "Horlics", 300, LocalDate.of(2023,11 , 10), LocalDate.of(2025,2 , 10), 15, "good health", "1kg", 5, 100, 5, 5, 2, 1, 5, "Vikas", "1.2kg", "sugar,dioxide,corbon", "Mothers-horlics",  LocalDate.of(1995, 10, 18), "Delhi", true, "India", "bnm678", "vb4567", true, "No Warranty", LocalDate.of(2023, 8, 11), LocalDate.of(2023, 8, 15),LocalDate.of(2023,8, 11));
		
		
		ProductDTO dtos2 = new ProductDTO(3, "Bag", 500, LocalDate.of(2023,11 , 14), LocalDate.of(2027,2 , 15), 10, "good tasty", "1kg", 5, 1000, 5, 3, 5, 1, 5, "Vijay", "250gms", "sugar,dioxide,corbon", "Fruti",  LocalDate.of(2021, 10, 18), "karnataka", false, "India", "fgh45678", "jkl78", false, "No Warranty", LocalDate.of(2013, 10, 11), LocalDate.of(2022, 8, 18),LocalDate.of(2013,10, 11));
		
		
		ProductDTO dtos3 = new ProductDTO(4, "Mobile",40000, LocalDate.of(2023,5 , 14), LocalDate.of(1947,10,12), 20, "good Processing", "200gms", 5, 1050, 5, 3, 2, 1, 4, "Iphone", "380gms", "charger,headphone etc", "cell",  LocalDate.of(2021, 10, 18), "India", true, "India", "hji4567", "cv34567", true, "1 year", LocalDate.of(2023, 11, 12), LocalDate.of(2023, 11, 15),LocalDate.of(2023,11, 14));
		
		
		ProductDTO dtos4 = new ProductDTO(5, "Bag", 2000, LocalDate.of(2023,10 , 18), LocalDate.of(2023,12 , 10), 30, "Fast charging", "500grms", 5, 1800, 5, 3, 2, 1, 3, "Samsung", "580grms", "Nilium corbide", "PowerBank",  LocalDate.of(2022, 1, 18), "TamilNadu", true, "India", "jkl741", "rrt45678", true, "1 year", LocalDate.of(2023, 12, 10), LocalDate.of(2023, 5, 17),LocalDate.of(2023,12, 10));
		
		
		ProductDTO dtos5 = new ProductDTO(6, "Laptop", 38000, LocalDate.of(2021,11 , 10), LocalDate.of(2029,2 , 10), 50, "Bad laptop", "1.2kg", 5, 1070, 5, 5, 4, 3, 1, "Dell", "1.3kg", "Hilium sulphar", "lap",  LocalDate.of(2022, 1, 15), "Delhi", false, "India", "asd4567", "45dfg78", true, "1 year", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 8, 18),LocalDate.of(2023,10, 9));
		
		
		ProductDTO dtos6 = new ProductDTO(7, "Bag", 1000, LocalDate.of(2010,11 , 10), LocalDate.of(2029,2 , 10), 50, "good quality", "200gms", 5, 100, 4, 3, 2, 5, 7, "Dell", "250gms", "Rubber material", "Bag",  LocalDate.of(2023, 10, 18), "Himachal Pradesh", true, "India", "ghj4567", "vb345", true, "1 year", LocalDate.of(2023, 10, 18), LocalDate.of(2022, 11, 18),LocalDate.of(2023,9, 14));
		
		
		ProductDTO dtos7 = new ProductDTO(8, "Fan", 1999, LocalDate.of(2012,9 , 14), LocalDate.of(2023,12 ,14), 10, "fan rotar", "1.5kg", 5, 100, 4, 5, 4, 5, 4, "Lg", "1.6kg", "Steel material", "fan",  LocalDate.of(2023, 05, 9), "karnataka", false, "India", "fg5678", "o788", true, "1 year", LocalDate.of(2023, 11, 11), LocalDate.of(2023, 11, 18),LocalDate.of(2023,8, 14));
		
		
		ProductDTO dtos8 = new ProductDTO(9, "Shoe", 4000, LocalDate.of(2019,11 , 14), LocalDate.of(2023,1 , 16), 40, "sports shoe", "400gms", 2, 5000, 5, 3, 4, 4, 4, "Nike", "500gms", "Lather and rabber", "Shoues",  LocalDate.of(2023, 04, 15), "Rajasthan", true, "India", "fgh45678", "df345678",true, "2 years", LocalDate.of(2023, 10, 11), LocalDate.of(20223, 10, 18), LocalDate.of(2023,12, 27));
		
		
		ProductDTO dtos9 = new ProductDTO(10, "Cloths", 5000, LocalDate.of(2010,11 , 10), LocalDate.of(2010,4, 10), 40, "good quality", "200ml", 5, 1524, 5, 5, 5, 4, 4, "Royal", "250gms", "cotton Fabrics", "fabrics",  LocalDate.of(2021, 10, 18), "karnataka", true, "India", "bn4567", "jk456", true, "1year", LocalDate.of(2023, 10, 11), LocalDate.of(2023, 12, 18), LocalDate.of(2023,12, 14));
		
		Collection<ProductDTO> collect = new ArrayList<ProductDTO>();
		collect.add(dtos);
		collect.add(dtos1);
		collect.add(dtos2);
		collect.add(dtos3);
		collect.add(dtos4);
		collect.add(dtos5);
		collect.add(dtos6);
		collect.add(dtos7);
		collect.add(dtos8);
		collect.add(dtos9);
		
		for (ProductDTO productDTO : collect) {
			System.out.println(productDTO);
		}
		
		System.out.println(".......................................");
	
		Comparator<ProductDTO> ids=(a1,a2)->{
			return Integer.compare(a1.getId(), a2.getId());
		};
		
		collect.stream().sorted(ids).forEach(o->System.out.println(o.getId()));
		
		System.out.println(".........................................");
		
		Comparator<ProductDTO> name=(i1,i2)->{
			return i1.getName().compareTo(i2.getName());
		};
		collect.stream().sorted(name).forEach(p->System.out.println(p.getName()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> name1=(d1,d2)->{
			return d2.getName().compareTo(d1.getName());
		};
		collect.stream().sorted(name1).forEach(k->System.out.println(k.getName()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> price=(p1,p2)->{
			return Integer.compare(p1.getPrice(), p2.getPrice());
		};
		collect.stream().sorted(price).forEach(l->System.out.println(l.getPrice()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> price1=(p3,p4)->{
			return Integer.compare(p4.getPrice(), p3.getPrice());
		};
		collect.stream().sorted(price1).forEach(c->System.out.println(c.getPrice()));
		System.out.println("....................................");
		
		Comparator<ProductDTO> date=(d1,d2)->{
			return d1.getManfDate().compareTo(d2.getManfDate());
		};
		collect.stream().sorted(date).forEach(d->System.out.println(d.getManfDate()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> date1=(d3,d4)->{
			return d4.getManfDate().compareTo(d3.getManfDate());
		};
		collect.stream().sorted(date1).forEach(k->System.out.println(k.getManfDate()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> disco=(n1,n2)->{
			return Integer.compare(n1.getDiscount(),n2.getDiscount());
		};
		
		collect.stream().sorted(disco).forEach(dis->System.out.println(dis.getDiscount()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> disco1=(n3,n4)->{
			return Integer.compare(n4.getDiscount(),n3.getDiscount());
		};
		
		collect.stream().sorted(disco1).forEach(disc->System.out.println(disc.getDiscount()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> discription=(m1,m2)->{
			return m1.getDescription().compareTo(m2.getDescription());
		};
		collect.stream().sorted(discription).forEach(di->System.out.println(di.getDescription()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> discription1=(m3,m4)->{
			return m4.getDescription().compareTo(m3.getDescription());
		};
		collect.stream().sorted(discription1).forEach(ha->System.out.println(ha.getDescription()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> pack=(b1,b2)->{
			return b1.getPacker().compareTo(b2.getPacker());
		};
		collect.stream().sorted(pack).forEach(pa->System.out.println(pa.getPacker()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> pack1=(b3,b4)->{
			return b4.getPacker().compareTo(b3.getPacker());
		};
		collect.stream().sorted(pack1).forEach(gr->System.out.println(gr.getPacker()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> itemWeight=(w1,w2)->{
			return w1.getTemWeight().compareTo(w2.getTemWeight());
		};
		collect.stream().sorted(itemWeight).forEach(we->System.out.println(we.getTemWeight()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> itemWeight1=(w3,w4)->{
			return w4.getTemWeight().compareTo(w3.getTemWeight());
		};
		collect.stream().sorted(itemWeight1).forEach(hr->System.out.println(hr.getTemWeight()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> include=(s1,s2)->{
			return s1.getIncluded().compareTo(s2.getIncluded());
		};
		collect.stream().sorted(include).forEach(re->System.out.println(re.getIncluded()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> include1=(s3,s4)->{
			return s4.getIncluded().compareTo(s3.getIncluded());
		};
		collect.stream().sorted(include1).forEach(ger->System.out.println(ger.getIncluded()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> gen=(g1,g2)->{
			return g1.getGenericName().compareTo(g2.getGenericName());
		};
		collect.stream().sorted(gen).forEach(ree->System.out.println(ree.getGenericName()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> gen1=(s3,s4)->{
			return s4.getGenericName().compareTo(s3.getGenericName());
		};
		collect.stream().sorted(gen1).forEach(gere->System.out.println(gere.getGenericName()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> firstdate=(s1,s2)->{
			return s1.getIncluded().compareTo(s2.getIncluded());
		};
		collect.stream().sorted(firstdate).forEach(re->System.out.println(re.getIncluded()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> firstdate1=(f1,f2)->{
			return f1.getDateFirstAvailble().compareTo(f2.getDateFirstAvailble());
		};
		collect.stream().sorted(firstdate1).forEach(each->System.out.println(each.getDateFirstAvailble()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> asin=(x1,x2)->{
			return x1.getAsin().compareTo(x2.getAsin());
		};
		collect.stream().sorted(asin).forEach(hd->System.out.println(hd.getAsin()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> asin1=(x3,x4)->{
			return x4.getAsin().compareTo(x3.getAsin());
		};
		collect.stream().sorted(asin1).forEach(sin->System.out.println(sin.getAsin()));
		
		System.out.println("................................");

		Comparator<ProductDTO> count=(v1,v2)->{
			return v1.getCountryOfOrigin().compareTo(v2.getCountryOfOrigin());
		};
		collect.stream().sorted(count).forEach(sd->System.out.println(sd.getCountryOfOrigin()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> count1=(v3,v4)->{
			return v4.getCountryOfOrigin().compareTo(v3.getCountryOfOrigin());
		};
		collect.stream().sorted(count1).forEach(va->System.out.println(va.getCountryOfOrigin()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> model=(h1,h2)->{
			return h1.getModelNo().compareTo(h2.getModelNo());
		};
		collect.stream().sorted(model).forEach(xe->System.out.println(xe.getModelNo()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> model1=(h3,h4)->{
			return h3.getModelNo().compareTo(h3.getModelNo());
		};
		collect.stream().sorted(model1).forEach(har->System.out.println(har.getModelNo()));
		
		System.out.println("................................");

		

		Comparator<ProductDTO> seriable=(u1,u2)->{
			return u1.getSerialNo().compareTo(u2.getSerialNo());
		};
		collect.stream().sorted(seriable).forEach(xee->System.out.println(xee.getSerialNo()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> seriable1=(u3,u4)->{
			return u4.getSerialNo().compareTo(u3.getSerialNo());
		};
		collect.stream().sorted(seriable1).forEach(hars->System.out.println(hars.getSerialNo()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> warranty=(t1,t2)->{
			return t1.getWarranty().compareTo(t2.getWarranty());
		};
		collect.stream().sorted(warranty).forEach(fr->System.out.println(fr.getWarranty()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> warranty1=(t3,t4)->{
			return t4.getWarranty().compareTo(t3.getWarranty());
		};
		collect.stream().sorted(warranty1).forEach(de->System.out.println(de.getWarranty()));
		
		System.out.println("................................");

		

		Comparator<ProductDTO> delivery=(f1,f2)->{
			return f1.getPrimeDelivery().compareTo(f2.getPrimeDelivery());
		};
		collect.stream().sorted(delivery).forEach(gee->System.out.println(gee.getPrimeDelivery()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> delivaery1=(f3,f4)->{
			return f4.getPrimeDelivery().compareTo(f3.getPrimeDelivery());
		};
		collect.stream().sorted(delivaery1).forEach(harsh->System.out.println(harsh.getPrimeDelivery()));
		
		System.out.println("................................");



		Comparator<ProductDTO> expected=(ha1,ha2)->{
			return ha1.getDeliveryExpectedDate().compareTo(ha2.getDeliveryExpectedDate());
		};
		collect.stream().sorted(expected).forEach(geee->System.out.println(geee.getDeliveryExpectedDate()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> expected1=(ha3,ha4)->{
			return ha4.getDeliveryExpectedDate().compareTo(ha3.getDeliveryExpectedDate());
		};
		collect.stream().sorted(expected1).forEach(harshi->System.out.println(harshi.getDeliveryExpectedDate()));
		
		System.out.println("................................");
		

		Comparator<ProductDTO> returna=(re1,re2)->{
			return re1.getReturnBy().compareTo(re2.getReturnBy());
		};
		collect.stream().sorted(returna).forEach(gehe->System.out.println(gehe.getReturnBy()));

		System.out.println(".......................................");
		
		
		Comparator<ProductDTO> returna1=(re3,re4)->{
			return re4.getReturnBy().compareTo(re3.getReturnBy());
		};
		collect.stream().sorted(returna1).forEach(harsht->System.out.println(harsht.getReturnBy()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating = (rt1,rt2)->{
			return Integer.compare(rt1.getRating(), rt2.getRating());
		};
		collect.stream().sorted(rating).forEach(rat-> System.out.println(rat.getRating()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating1 = (rt3,rt4)->{
			return Integer.compare(rt4.getRating(), rt3.getRating());
		};
		collect.stream().sorted(rating1).forEach(rat-> System.out.println(rat.getRating()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> total = (to1,to2)->{
			return Integer.compare(to1.getTotalPeopleRated(), to2.getTotalPeopleRated());
		};
		collect.stream().sorted(total).forEach(tot-> System.out.println(tot.getTotalPeopleRated()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> total1 = (to3,to4)->{
			return Integer.compare(to4.getTotalPeopleRated(), to3.getTotalPeopleRated());
		};
		collect.stream().sorted(total1).forEach(tot1-> System.out.println(tot1.getTotalPeopleRated()));
		
		System.out.println("................................");
		
		
		Comparator<ProductDTO> rating2 = (le1,le2)->{
			return Integer.compare(le1.getPeopleRatedFive(), le2.getPeopleRatedFive());
		};
		collect.stream().sorted(rating2).forEach(fd-> System.out.println(fd.getPeopleRatedFive()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating3 = (le3,le4)->{
			return Integer.compare(le4.getPeopleRatedFive(), le3.getPeopleRatedFive());
		};
		collect.stream().sorted(rating3).forEach(rate-> System.out.println(rate.getPeopleRatedFive()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating4 = (jr1,jr2)->{
			return Integer.compare(jr1.getPeopleRatedFour(), jr2.getPeopleRatedFour());
		};
		collect.stream().sorted(rating4).forEach(fde-> System.out.println(fde.getPeopleRatedFour()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating5 = (jr3,jr4)->{
			return Integer.compare(jr4.getPeopleRatedFour(), jr3.getPeopleRatedFour());
		};
		collect.stream().sorted(rating5).forEach(ratee-> System.out.println(ratee.getPeopleRatedFour()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating6 = (be1,be2)->{
			return Integer.compare(be1.getPeopleRatedThree(), be2.getPeopleRatedThree());
		};
		collect.stream().sorted(rating6).forEach(fdd-> System.out.println(fdd.getPeopleRatedThree()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating7 = (be3,be4)->{
			return Integer.compare(be4.getPeopleRatedThree(), be3.getPeopleRatedThree());
		};
		collect.stream().sorted(rating7).forEach(ratee-> System.out.println(ratee.getPeopleRatedThree()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating8 = (bv1,bv2)->{
			return Integer.compare(bv1.getPeopleRatedTwo(), bv2.getPeopleRatedTwo());
		};
		collect.stream().sorted(rating8).forEach(fded-> System.out.println(fded.getPeopleRatedTwo()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> rating9 = (bv3,bv4)->{
			return Integer.compare(bv4.getPeopleRatedTwo(), bv3.getPeopleRatedTwo());
		};
		collect.stream().sorted(rating9).forEach(rateed-> System.out.println(rateed.getPeopleRatedTwo()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> ratingg = (q1,q2)->{
			return Integer.compare(q1.getPeopleRatedOne(), q2.getPeopleRatedOne());
		};
		collect.stream().sorted(ratingg).forEach(fdedd-> System.out.println(fdedd.getPeopleRatedOne()));
		
		System.out.println("................................");
		
		Comparator<ProductDTO> ratingg1 = (q3,q4)->{
			return Integer.compare(q4.getPeopleRatedOne(), q3.getPeopleRatedOne());
		};
		collect.stream().sorted(ratingg1).forEach(rateed-> System.out.println(rateed.getPeopleRatedTwo()));
		
		System.out.println("................................");
		
		
		collect.stream().sorted(name.thenComparing(price.thenComparing(date))).forEach(ka->System.out.println(ka));
		
		System.out.println("............................................................");
		
		collect.stream().sorted(name1.thenComparing(price1.thenComparing(date1))).forEach(kal->System.out.println(kal));
		
		System.out.println(".................................................................");
		
		collect.stream().sorted(total.thenComparing(rating2.thenComparing(rating4))).forEach(ra->System.out.println(ra));
		
		System.out.println("....................................................................");
		
		collect.stream().sorted(name1.thenComparing(discription1)).forEach(gy->System.out.println(gy));
		
		
				
		
		
			
				
		

		
		
		
	}

}
