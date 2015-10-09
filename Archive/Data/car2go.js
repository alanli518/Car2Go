//https://www.car2go.com/api/v2.1/vehicles?loc=austin&oauth_consumer_key=car2gowebsite&format=json

var car2go = require("car2go").createClient({
  key: "car2gowebsite",
//  secret: MY_OAUTH_SECRET
});
 
// get a list of available cars in Toronto in JSON format 
car2go.vehicles({
  format: "json",
  loc: "Toronto"
}, function(err, cars) {
  if (err) {
    return console.log(err);
  }
 
  console.log(cars);
});