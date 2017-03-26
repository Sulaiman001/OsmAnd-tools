package net.osmand.data.preparation.address;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommonWords {
	private static Map<String, Integer> commonWordsDictionary = new LinkedHashMap<>();
	private static void addCommon(String string) {
		commonWordsDictionary.put(string, commonWordsDictionary.size());
	}
	
	public static int getCommon(String name) {
		Integer i = commonWordsDictionary.get(name);
		return i == null ? -1 : i.intValue();
	}
	
	static {
		addCommon("la");
		addCommon("via");
		addCommon("rua");
		addCommon("de");
		addCommon("du");
		addCommon("des");
		addCommon("del");
		addCommon("am");
		addCommon("da");
		addCommon("a");
		addCommon("der");
		addCommon("do");
		addCommon("los");
		addCommon("di");
		addCommon("im");
		addCommon("el");
		addCommon("e");
		addCommon("an");
		addCommon("g.");
		addCommon("rd");
		addCommon("dos");
		addCommon("dei");
		addCommon("b");
		addCommon("st");
		addCommon("the");
		addCommon("las");
		addCommon("f");
		addCommon("u");
		addCommon("jl.");
		addCommon("j");
		addCommon("sk");
		addCommon("w");
		addCommon("a.");
		addCommon("of");
		addCommon("k");
		addCommon("r");
		addCommon("h");
		addCommon("mc");
		addCommon("sw");
		addCommon("g");
		addCommon("v");
		addCommon("m");
		addCommon("c.");
		addCommon("r.");
		addCommon("ct");
		addCommon("e.");
		addCommon("dr.");
		addCommon("j.");		
		addCommon("in");
		addCommon("al");
		addCommon("út");
		addCommon("per");
		addCommon("ne");
		addCommon("p");
		addCommon("et");
		addCommon("s.");
		addCommon("f.");
		addCommon("t");
		addCommon("fe");
		addCommon("à");
		addCommon("i");
		addCommon("c");
		addCommon("le");
		addCommon("s");
		addCommon("av.");
		addCommon("den");
		addCommon("dr");
		addCommon("y");
		
		
		
		addCommon("van");
		addCommon("road");
		addCommon("street");
		addCommon("drive");
		addCommon("avenue");
		addCommon("rue");
		addCommon("lane");
		addCommon("улица");
		addCommon("straße");
		addCommon("chemin");
		addCommon("way");
		
		addCommon("court");
		addCommon("calle");
		addCommon("north");
		addCommon("west");
		addCommon("east");
		
		addCommon("south");
		addCommon("place");
		
		addCommon("avenida");
		addCommon("boulevard");
		addCommon("county");
		addCommon("route");
		addCommon("trail");
		addCommon("circle");
		addCommon("close");
		addCommon("highway");
		
		addCommon("strada");
		addCommon("northeast");
		addCommon("park");
		addCommon("northwest");
		addCommon("southwest");
		addCommon("hill");
		addCommon("impasse");
		addCommon("utca");
		addCommon("creek");
		addCommon("san");
		addCommon("carrer");
		addCommon("southeast");
		addCommon("вулиця");
		addCommon("crescent");
		addCommon("lake");
		addCommon("allée");
		addCommon("old");
		addCommon("weg");
		
		addCommon("terrace");
		addCommon("jalan");
		
		addCommon("ridge");
		addCommon("carrera");
		addCommon("main");
		addCommon("oak");
		addCommon("josé");
		
		addCommon("parkway");
		addCommon("forest");
		addCommon("переулок");
		
		addCommon("state");
		addCommon("carretera");
		addCommon("grove");
		addCommon("valley");
		
		addCommon("view");
		
		
		
		addCommon("river");
		addCommon("santa");
		addCommon("camino");
		addCommon("range");
		addCommon("pine");
		
		addCommon("church");
		addCommon("viale");
		addCommon("loop");
		addCommon("mill");
		
		addCommon("bridge");
		addCommon("township");
		addCommon("green");
		addCommon("hauptstraße");
		addCommon("point");
		addCommon("piazza");
		addCommon("della");
		
		addCommon("cove");
		addCommon("gardens");
		
		addCommon("plaza");
		addCommon("travessa");
		addCommon("pasaje");
		
		addCommon("francisco");
		addCommon("mountain");
		addCommon("jean");
		addCommon("joão");
		addCommon("meadow");
		addCommon("farm");
		addCommon("juan");
		
		addCommon("bay");
		addCommon("expressway");
		addCommon("run");
		addCommon("national");
		addCommon("cedar");
		addCommon("hollow");
		addCommon("new");
		addCommon("ruta");
		addCommon("high");
		addCommon("square");
		addCommon("maple");
		addCommon("freeway");
		addCommon("antonio");
		addCommon("provinciale");
		addCommon("walk");
		addCommon("maria");
		addCommon("dorfstraße");
		addCommon("spring");
		addCommon("pedro");
		addCommon("estrada");
		addCommon("line");
		
		addCommon("track");
		
		addCommon("vista");
		addCommon("zum");
		addCommon("rodovia");
		addCommon("sokak");
		addCommon("grand");
		addCommon("sur");
		addCommon("path");
		addCommon("saint");
		addCommon("giuseppe");
		addCommon("antônio");
		addCommon("das");
		
		addCommon("development");
		addCommon("washington");
		addCommon("white");
		addCommon("john");
		addCommon("bahnhofstraße");
		addCommon("silva");
		addCommon("willow");
		addCommon("yolu");
		addCommon("school");
		addCommon("giovanni");
		addCommon("canyon");
		
		addCommon("проспект");
		
		addCommon("general");
		addCommon("charles");
		addCommon("king");
		
		addCommon("village");

		addCommon("moulin");
		addCommon("auf");
		addCommon("alley");
		addCommon("monte");
		addCommon("wood");
		addCommon("são");
		addCommon("glen");
		addCommon("nw");
		addCommon("rio");
		addCommon("les");
		addCommon("elm");
		addCommon("rock");
		addCommon("center");
		addCommon("mount");
		addCommon("tree");
		addCommon("red");
		addCommon("central");
		addCommon("norte");
		addCommon("delle");
		addCommon("église");
		addCommon("carlos");
		addCommon("springs");
		addCommon("doutor");
		addCommon("grande");
		addCommon("martin");
		addCommon("paseo");
		addCommon("station");
		addCommon("statale");
		addCommon("alte");
		addCommon("paul");
		addCommon("hills");
		addCommon("beach");
		addCommon("brook");
		addCommon("walnut");
		addCommon("gate");
		addCommon("oaks");
		addCommon("cross");
		addCommon("pont");
		addCommon("autostrada");
		addCommon("pierre");
		addCommon("iela");
		addCommon("autovía");
		addCommon("rural");
		addCommon("service");
		addCommon("d");
		addCommon("manuel");
		addCommon("country");
		addCommon("blue");
		addCommon("ii");
		addCommon("ulica");
		addCommon("miguel");
		addCommon("branch");
		addCommon("cherry");
		addCommon("don");
		addCommon("lincoln");
		addCommon("orchard");
		
		addCommon("little");
		addCommon("memorial");
		
		addCommon("clos");
		addCommon("club");
		addCommon("na");
		addCommon("проезд");
		addCommon("bois");
		addCommon("james");
		addCommon("island");
		addCommon("ranch");
		addCommon("louis");
		addCommon("pond");
		addCommon("sunset");
		addCommon("n");
		addCommon("ул.");
		addCommon("george");
		addCommon("général");
		addCommon("voie");
		addCommon("costa");
		addCommon("santos");
		addCommon("ring");
		addCommon("victoria");
		addCommon("albert");
		addCommon("manor");
		addCommon("hall");
		addCommon("cemetery");
		addCommon("rose");
		addCommon("luis");
		addCommon("fox");
		addCommon("doctor");
		addCommon("long");
		addCommon("ruelle");
		addCommon("río");
		addCommon("alameda");
		addCommon("smith");
		addCommon("padre");
		addCommon("woods");
		addCommon("vicolo");
		addCommon("villa");
		addCommon("avinguda");
		addCommon("landstraße");
		addCommon("шоссе");
		addCommon("lotissement");
		addCommon("indian");
		addCommon("pleasant");
		addCommon("zur");
		addCommon("jackson");
		addCommon("water");
		addCommon("wilson");
		addCommon("corso");
		addCommon("hickory");
		addCommon("autopista");
		addCommon("провулок");
		addCommon("deer");
		addCommon("birch");
		addCommon("chestnut");
		addCommon("eagle");
		addCommon("laurel");
		addCommon("heights");
		addCommon("broadway");
		addCommon("to");
		addCommon("passage");
		addCommon("jana");
		addCommon("sentier");
		addCommon("shore");
		addCommon("highland");
		addCommon("lee");
		addCommon("aleja");
		addCommon("roma");
		addCommon("oliveira");
		addCommon("garden");
		addCommon("turnpike");
		addCommon("dem");
		addCommon("château");
		addCommon("provincial");
		addCommon("thomas");
		addCommon("camp");
		addCommon("largo");
		addCommon("access");
		addCommon("georges");
		addCommon("college");
		addCommon("valle");
		addCommon("schulstraße");
		addCommon("chapel");
		addCommon("canal");
		addCommon("house");
		addCommon("cruz");
		addCommon("rosa");
		addCommon("johnson");
		
		
		addCommon("bypass");
		addCommon("rúa");
		addCommon("upper");
		addCommon("union");
		addCommon("crest");
		addCommon("gare");
		addCommon("market");
		addCommon("ленина");
		addCommon("jefferson");
		addCommon("stone");
		addCommon("franklin");
		addCommon("résidence");
		addCommon("francesco");
		
		addCommon("railroad");
		addCommon("black");
		addCommon("fontaine");
		addCommon("silver");
		addCommon("lower");
		addCommon("mile");
		addCommon("henri");
		
		addCommon("big");
		addCommon("brown");
		addCommon("ave");
		
		addCommon("kennedy");
		addCommon("pereira");
		addCommon("airport");
		addCommon("spruce");
		addCommon("expressway)");
		addCommon("woodland");
		addCommon("robert");
		addCommon("victor");
		addCommon("manoel");
		
		addCommon("meadows");
		addCommon("town");
		addCommon("vicente");
		addCommon("ash");
		addCommon("rise");
		addCommon("pike");
		addCommon("luigi");
		addCommon("autoroute");
		addCommon("sant");
		addCommon("santo");
		addCommon("western");
		addCommon("poplar");
		addCommon("советская");
		addCommon("croix");
		addCommon("real");
		addCommon("crossing");
		addCommon("vittorio");
		addCommon("camí");
		addCommon("mews");
		addCommon("cesta");
		addCommon("taylor");
		addCommon("davis");
		addCommon("bend");
		addCommon("jose");
		addCommon("frontage");
		addCommon("gaulle");
		addCommon("bank");
		addCommon("ferry");
		addCommon("nord");
		addCommon("holly");
		addCommon("bergstraße");
		addCommon("castle");
		
		addCommon("sierra");
		addCommon("acceso");
		addCommon("royal");
		addCommon("praça");
		addCommon("williams");
		addCommon("souza");
		addCommon("madison");
		addCommon("joseph");
		addCommon("riverside");
		addCommon("adams");
		addCommon("nacional");
		addCommon("oude");
		addCommon("tee");
		addCommon("port");
		addCommon("private");
		addCommon("mayo");
		addCommon("carlo");
		addCommon("york");
		addCommon("ferreira");
		addCommon("giacomo");
		addCommon("end");
		addCommon("parade");
		addCommon("val");
		
		addCommon("field");
		addCommon("professor");
		
		addCommon("caddesi");
		addCommon("bis");
		addCommon("jones");
		addCommon("maría");
		addCommon("lakeview");
		addCommon("great");
		addCommon("alves");
		addCommon("miller");
		addCommon("william");
		addCommon("quai");
		addCommon("gartenstraße");
		addCommon("henry");
		addCommon("coronel");
		addCommon("industrial");
		addCommon("maréchal");
		
		addCommon("ქუჩა");
		addCommon("kalea");
		addCommon("acres");
		addCommon("joaquim");
		addCommon("landing");
		addCommon("summit");
		addCommon("burgemeester");
		addCommon("magnolia");
		addCommon("trace");
		addCommon("pass");
		addCommon("presidente");
		addCommon("falls");
		addCommon("jules");
		addCommon("ponte");
		addCommon("docteur");
		addCommon("pacific");
		addCommon("auzoa");
		addCommon("prairie");
		addCommon("luiz");
		addCommon("cruce");
		addCommon("diagonal");
		addCommon("cypress");
		addCommon("mar");
		addCommon("harbor");
		addCommon("shady");
		addCommon("clark");
		addCommon("fort");
		addCommon("bluff");
		addCommon("grant");
		addCommon("fork");
		addCommon("se");
		addCommon("fire");
		addCommon("au");
		addCommon("petit");
		addCommon("sycamore");
		addCommon("nelson");
		addCommon("queen");
		addCommon("city");
		addCommon("vico");
		addCommon("józefa");
		
		addCommon("pietro");
		addCommon("allee");
		addCommon("bear");
		
		addCommon("autobahn");
		addCommon("lima");
		addCommon("центральная");
		addCommon("pablo");
		addCommon("golden");
		addCommon("väg");
		addCommon("mary");
		addCommon("hillside");
		addCommon("haven");
		addCommon("alberto");
		addCommon("ln");
		addCommon("lorong");
		addCommon("elizabeth");
		addCommon("kings");
		addCommon("dogwood");
		addCommon("scott");
		addCommon("beech");
		addCommon("lange");
		addCommon("andré");
		addCommon("sentiero");
		addCommon("verde");
		addCommon("front");
		addCommon("obere");
		addCommon("hidden");
		addCommon("centre");
		addCommon("hamilton");
		addCommon("arthur");
		addCommon("parc");
		addCommon("quail");
		addCommon("julio");
		addCommon("jan");
		addCommon("plaça");
		addCommon("bell");
		addCommon("sandy");
		addCommon("back");
		addCommon("sud");
		addCommon("paulo");
		addCommon("lago");
		addCommon("locust");
		addCommon("martín");
		addCommon("gabriel");
		addCommon("chase");
		addCommon("palm");
		addCommon("sand");
		addCommon("o");
		addCommon("vej");
		addCommon("aux");
		addCommon("liberty");
		addCommon("l");
		addCommon("mairie");
		addCommon("jorge");
		addCommon("castro");
		addCommon("fernando");
		addCommon("alter");
		addCommon("spur");
		addCommon("salvador");
		addCommon("hillcrest");
		addCommon("lindenstraße");
		addCommon("cité");
		addCommon("ringstraße");
		addCommon("rodrigues");
		addCommon("prospect");
		addCommon("golf");
		addCommon("dom");
		addCommon("m.");
		addCommon("jacques");
		addCommon("chaussee");
		addCommon("berliner");
		addCommon("row");
		addCommon("santiago");
		addCommon("transversal");
		addCommon("садовая");
		addCommon("guglielmo");
		addCommon("pointe");
		addCommon("circuit");
		addCommon("rang");
		addCommon("françois");
		addCommon("lewis");
		addCommon("railway");
		
		addCommon("allen");
		addCommon("grange");
		addCommon("ronda");
		addCommon("link");
		addCommon("harrison");
		addCommon("tower");
		addCommon("garibaldi");
		addCommon("novembre");
		addCommon("heritage");
		addCommon("anderson");
		addCommon("kirchstraße");
		addCommon("evergreen");
		addCommon("ribeiro");
		addCommon("ford");
		addCommon("linden");
		
		addCommon("travesía");
		addCommon("short");
		addCommon("walker");
		addCommon("marie");
		addCommon("twin");
		addCommon("degli");
		addCommon("untere");
		addCommon("university");
		addCommon("douglas");
		addCommon("marconi");
		addCommon("martins");
		addCommon("windsor");
		addCommon("мира");
		addCommon("david");
		addCommon("middle");
		addCommon("fairview");
		addCommon("stanisława");
		addCommon("timber");
		addCommon("thompson");
		addCommon("generała");
		addCommon("virginia");
		addCommon("piazzale");
		addCommon("broad");
		addCommon("vei");
		addCommon("waldstraße");
		addCommon("pasteur");
		addCommon("promenade");
		addCommon("hugo");
		addCommon("montée");
		addCommon("gomes");
		addCommon("warren");
		addCommon("luther");
		addCommon("columbia");
		addCommon("puente");
		addCommon("lakes");
		addCommon("campo");
		addCommon("puerto");
		addCommon("république");
		addCommon("enrico");
		addCommon("rond-point");
		addCommon("champ");
		addCommon("lawrence");
		addCommon("monroe");
		addCommon("alessandro");
		addCommon("władysława");
		addCommon("vía");
		addCommon("pod");
		addCommon("campbell");
		addCommon("pinto");
		addCommon("школьная");
		addCommon("estates");
		addCommon("howard");
		addCommon("orange");
		addCommon("croft");
		addCommon("star");
		addCommon("est");
		addCommon("triq");
		addCommon("beaver");
		addCommon("principale");
		addCommon("paz");
		addCommon("sol");
		addCommon("vieux");
		addCommon("hwy");
		addCommon("southern");
		addCommon("greenway");
		addCommon("rocky");
		addCommon("roosevelt");
		addCommon("οδός");
		addCommon("mai");
		addCommon("dels");
		addCommon("aspen");
		addCommon("russell");
		addCommon("pines");
		addCommon("concession");
		addCommon("wellington");
		addCommon("barrio");
		addCommon("neue");
		addCommon("post");
		addCommon("vale");
		addCommon("and");
		
		addCommon("молодёжная");
		addCommon("октябрьская");
		addCommon("london");
		addCommon("four");
		addCommon("machado");
		addCommon("parque");
		addCommon("augusto");
		addCommon("carvalho");
		addCommon("markt");
		addCommon("division");
		addCommon("marina");
		addCommon("almeida");
		addCommon("horse");
		addCommon("berg");
		addCommon("mitchell");
		addCommon("pearl");
		addCommon("governador");
		addCommon("side");
		addCommon("pré");
		addCommon("robin");
		addCommon("iii");
		addCommon("vignes");
		addCommon("dale");
		addCommon("oriente");
		addCommon("coast");
		addCommon("baker");
		addCommon("ann");
		addCommon("europa");
		addCommon("maurice");
		addCommon("plac");
		addCommon("prince");
		addCommon("jardins");
		addCommon("ocean");
		addCommon("harris");
		addCommon("fairway");
		addCommon("oxford");
		addCommon("kirchweg");
		
		addCommon("sunrise");
		addCommon("moore");
		addCommon("apple");
		addCommon("birkenweg");
		addCommon("flores");
		addCommon("marcel");
		addCommon("morgan");
		addCommon("ana");
		addCommon("cesare");
		addCommon("comunale");
		addCommon("mário");
		addCommon("olive");
		addCommon("rené");
		addCommon("vine");
		addCommon("rafael");
		addCommon("champs");
		addCommon("farm-to-market");
		addCommon("nova");
		
		addCommon("brasil");
		addCommon("privada");
		addCommon("barbosa");
		addCommon("набережная");
		addCommon("mare");
		addCommon("dias");
		
		addCommon("leclerc");
		addCommon("daniel");
		addCommon("dante");
		addCommon("parker");
		addCommon("francis");
		addCommon("prés");
		addCommon("knoll");
		addCommon("torre");
		addCommon("contrada");
		addCommon("località");
		addCommon("mesa");
		addCommon("stade");
		addCommon("chaussée");
		addCommon("hampton");
		addCommon("alfredo");
		addCommon("peak");
		addCommon("lakeside");
		addCommon("ross");
		
		addCommon("лесная");
		addCommon("ivy");
		addCommon("filho");
		addCommon("mills");
		addCommon("major");
		addCommon("fratelli");
		addCommon("garcía");
		addCommon("wild");
		addCommon("gordon");
		addCommon("diego");
		addCommon("cerro");
		addCommon("cambridge");
		addCommon("alta");
		addCommon("home");
		addCommon("ramón");
		addCommon("raymond");
		addCommon("juniper");
		addCommon("redwood");
		addCommon("crystal");
		addCommon("mulberry");
		addCommon("новая");
		addCommon("poniente");
		addCommon("náměstí");
		addCommon("alten");
		addCommon("гагарина");
		addCommon("bellevue");
		addCommon("veterans");
		addCommon("hope");
		addCommon("jaurès");
		addCommon("summer");
		addCommon("bahnhof");
		addCommon("r-c");
		addCommon("oakwood");
		addCommon("richmond");
		addCommon("paris");
		addCommon("us");
		addCommon("lorenzo");
		addCommon("hof");
		addCommon("tér");
		addCommon("mariano");
		addCommon("navajo");
		addCommon("комсомольская");
		addCommon("kleine");
		addCommon("lodge");
		addCommon("torres");
		addCommon("roundabout");
		addCommon("no");
		addCommon("lakeshore");
		addCommon("leśna");
		addCommon("cardinal");
		addCommon("marsh");
		addCommon("fern");
		addCommon("campos");
		addCommon("nationale");
		addCommon("berry");
		addCommon("commerce");
		addCommon("ignacio");
		addCommon("acesso");
		addCommon("madrid");
		addCommon("mission");
		addCommon("gang");
		addCommon("oeste");
		addCommon("cherokee");
		addCommon("paolo");
		addCommon("stewart");
		addCommon("cliff");
		addCommon("eduardo");
		addCommon("marshall");
		addCommon("dam");
		addCommon("pioneer");
		addCommon("alfred");
		addCommon("greenwood");
		addCommon("robinson");
		addCommon("acacias");
		addCommon("alle");
		addCommon("lópez");
		addCommon("gasse");
		addCommon("str.");
		addCommon("tadeusza");
		addCommon("leonardo");
		addCommon("p.");
		addCommon("hilltop");
		addCommon("diamond");
		addCommon("tr");
		addCommon("quarry");
		addCommon("het");
		addCommon("temple");
		addCommon("scenic");
		addCommon("alexander");
		addCommon("победы");
		addCommon("osiedle");
		addCommon("écoles");
		addCommon("cleveland");
		addCommon("lynn");
		addCommon("top");
		addCommon("mont");
		addCommon("polna");
		addCommon("leaf");
		addCommon("vieira");
		addCommon("damm");
		addCommon("cottonwood");
		addCommon("perry");
		addCommon("morris");
		addCommon("oberer");
		addCommon("domingo");
		addCommon("hawthorne");
		addCommon("autumn");
		addCommon("alto");
		addCommon("chapelle");
		addCommon("kelly");
		addCommon("sherwood");
		addCommon("garcia");
		addCommon("bruce");
		addCommon("cour");
		addCommon("petite");
		addCommon("talstraße");
		addCommon("gap");
		addCommon("sea");
		addCommon("émile");
		addCommon("murray");
		addCommon("tangenziale");
		addCommon("mühlenweg");
		addCommon("ville");
		addCommon("gonçalves");
		addCommon("eastern");
		addCommon("belle");
		addCommon("northern");
		addCommon("xxiii");
		addCommon("vicinale");
		addCommon("hemlock");
		addCommon("hunter");
		addCommon("лет");
		addCommon("roberts");
		addCommon("heather");
		addCommon("beco");
		addCommon("bernardo");
		addCommon("verte");
		addCommon("platz");
		
		addCommon("arbor");
		addCommon("puits");
		addCommon("mine");
		addCommon("stefana");
		addCommon("güterweg");
		addCommon("newton");
		addCommon("кирова");
		addCommon("riverview");
		addCommon("clay");
		addCommon("sint");
		addCommon("aldo");
		addCommon("schillerstraße");
		addCommon("tilleuls");
		addCommon("claude");
		addCommon("kossuth");
		addCommon("edward");
		addCommon("communale");
		addCommon("fuente");
		addCommon("cooper");
		addCommon("trails");
		addCommon("nieuwe");
		addCommon("sebastião");
		addCommon("roberto");
		addCommon("overlook");
		addCommon("первомайская");
		addCommon("roger");
		addCommon("turner");
		addCommon("france");
		addCommon("mario");
		addCommon("iv");
		addCommon("sugar");
		addCommon("hudson");
		addCommon("lopes");
		addCommon("evans");
		addCommon("porto");
		addCommon("cottage");
		addCommon("raya");
		addCommon("branco");
		addCommon("vernon");
		addCommon("traverse");
		addCommon("emerald");
		addCommon("dove");
		addCommon("felipe");
		addCommon("wildwood");
		addCommon("moro");
		addCommon("marechal");
		addCommon("köz");
		addCommon("marion");
		
		addCommon("marco");
		addCommon("léon");
		addCommon("mt");
		addCommon("площадь");
		addCommon("veneto");
		addCommon("mazzini");
		addCommon("plum");
		addCommon("boundary");
		addCommon("barros");
		addCommon("tour");
		addCommon("andrews");
		addCommon("wiesenweg");
		addCommon("maggio");
		addCommon("ricardo");
		addCommon("pennsylvania");
		addCommon("myrtle");
		addCommon("matteotti");
		addCommon("hinter");
		addCommon("goethestraße");
		addCommon("линия");
		addCommon("ouest");
		addCommon("maja");
		addCommon("kent");
		addCommon("stanley");
		addCommon("jacob");
		addCommon("principal");
		addCommon("rogers");
		addCommon("homestead");
		addCommon("collins");
		addCommon("richard");
		addCommon("crown");
		addCommon("moss");
		addCommon("moreno");
		addCommon("sideroad");
		addCommon("garfield");
		addCommon("belmont");
		addCommon("rolling");
		addCommon("sportplatz");
		addCommon("côte");
		addCommon("hospital");
		addCommon("sun");
		addCommon("горького");
		addCommon("industriestraße");
		addCommon("flat");
		addCommon("colonial");
		addCommon("ramos");
		addCommon("lilas");
		addCommon("mason");
		addCommon("forge");
		addCommon("shadow");
		addCommon("gold");
		addCommon("rocha");
		addCommon("linda");
		addCommon("young");
		addCommon("pista");
		addCommon("estate");
		addCommon("mühlenstraße");
		addCommon("martiri");
		addCommon("verdi");
		addCommon("augusta");
	}


	
}