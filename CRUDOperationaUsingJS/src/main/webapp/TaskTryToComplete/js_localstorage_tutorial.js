console.log("Page is Ready")
var take_input_key1 = document.getElementById("take_input_key1")
var take_input_key2 = document.getElementById("take_input_key2")
var take_input_key3 = document.getElementById("take_input_key3")
var take_input_key4 = document.getElementById("take_input_key4")
var take_input_key5 = document.getElementById("take_input_key5")
var take_input_key6 = document.getElementById("take_input_key6")
var take_input_key7 = document.getElementById("take_input_key7")
var save_value = document.getElementById("save_value")

save_value.onclick = function () {
    localStorage.setItem(
        take_input_key1.value, take_input_key2.value,
        take_input_key3.value,take_input_key4.value,
        take_input_key5.value,take_input_key6.value,
        take_input_key7.value);
}

read_localstorage.onclick = function () {
    localstorage_value.textContent = localStorage.getItem("name");
}


read_all_data.onclick = function () {
    var keys = Object.keys(localStorage);
    console.log(keys);

    for (var key of keys) {
        console.log("Key : " + key + " : Value : " + localStorage.getItem(key));
    }
}