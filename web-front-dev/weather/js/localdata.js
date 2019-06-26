let pageNav = document.getElementById('page-nav');
let statusContainer = document.getElementById('status');
let contentContainer = document.getElementById('main-content');
let hourlyList = document.getElementById("hourlyData");

pageNav.addEventListener("click", function (evt) {
    let cityName = evt.target

}) //ends the event listener

let weatherURL = "/greenville-local/js/weather/json";

//fetchData(weatherURL);

//function fetchData(weatherURL) {
// let cityName = 'Greenville'; // The data we want from the weather.json file
fetch(weatherURL)
    .then(function (response) {
        if (response.ok) {
            return response.json();
        }
    })





//}..ends function
}) // ends the event listener