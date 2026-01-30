export function openOrSenior(data:number[][]):string[]{
  
  let output: string[] = [];
  
  for (const [age, handicap] of data){
    if( age > 54 && handicap > 7){
      output.push("Senior");
    } else {
      output.push("Open");
    }
  }
  
  return output;
}