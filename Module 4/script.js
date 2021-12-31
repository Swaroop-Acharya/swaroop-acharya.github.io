var names=new Array();
names[0]="Swaroop";
names[1]="John";
names[2]="Jupi";
names[3]="jason";
names[4]="paul";
names[5]="JACk";
names[6]="lux";
names[7]="paula";
names[8]="LOVE";
names[9]="jon";


for (var i = 0; i < names.length; i++) {
	if(names[i].charAt(0)==='J'|| names[i].charAt(0)==='j'){
        console.log("Goodbye "+ names[i])
	}
	else{
		console.log("Hello "+ names[i])
	}
}