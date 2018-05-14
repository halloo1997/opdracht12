const wrapper = document.getElementById('wrapper');
const myAssignment = document.getElementById('myAssignment');
const myAnswer = document.getElementById('myAnswer');
const feedback = document.getElementById('enter');

var goed = 0;
var fout = 0;
let mySum;
let sound = new Audio();
var status = 0;
var time = 0;

function makeSum() {
  var a = Math.floor(Math.random() * 9 + 1);
  var b = Math.floor(Math.random() * 9 + 1);
  mySum = a * b;
  myAssignment.innerHTML = a + " x " + b;
  myAnswer.focus();
  status = 1;
  timer();
}
function keyPressed(evt) {
  if (evt.keyCode == 13) {
    if (eval(mySum) == myAnswer.value) {
      feedback.src = "img/goed.jpg";
      sound.src = "img/ES_Happy Chiptune 1 - Josef Habib.mp3"
      sound.play();
      goed += 1;
      document.getElementById("goed").innerHTML = goed;
      status = 0;
    } else {
      feedback.src = "img/fout.jpg";
      sound.src = "img/ES_Sad Drama 5 - Merlean.mp3"
      sound.play();
      fout += 1;
      document.getElementById("fout").innerHTML = fout;
      status = 0;
    }

    window.setTimeout(waiting,2000);
  }
}

function waiting() {
  feedback.src = "img/feedback.png";
  myAnswer.value = "";
  makeSum();
}
function timer(){
  if (status == 1){
    setTimeout(function(){
      time++;
      var min = Math.floor(time/100/60);
      var sec = Math.floor(time/100);
      var mSec = time % 100;

      if (min < 10){
        min = "0" + min;
      }
      if(sec >=60){
        sec = sec % 60;
      }
      if (sec < 10){
        sec = "0" + sec;
      }
      document.getElementById("timer").innerHTML= min + ":" + sec;
      timer();
    }, 10);
  }
}
makeSum();
myAnswer.addEventListener("keydown", keyPressed, false);
