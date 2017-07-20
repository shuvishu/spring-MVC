/**
 * Created by hackerfreak on 19/7/17.
 */
function callOnRegSubmit() {
    var x=document.forms["formReg"]["fname"].value;
    if(x==""){alert("fill out the name");
    return false}
    return true;

}