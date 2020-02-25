function Calc(){
    
    var a;
    var b;
    var c;
    var ope;
    
    with(document.form1){
        a = parseInt(txtA.value);
        b = parseInt(txtB.value);
        ope = parseInt(selOpe.value);
    }
    
    switch(ope){
        case 1:
            c = a+b;
            break;
        case 2:
            c = a-b;
            break;
        case 3:
            c = a*b;
            break;
        case 4:
            c = a/b;
            break;
        case 5:
            c = a%b;
            break;
        default:
            break;
    }
    
    document.form1.txtC.value = c;
}