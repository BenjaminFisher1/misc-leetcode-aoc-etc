std::string get_middle(std::string input) 
{
  int leng = input.length();
  if (leng % 2)
    return input.substr(leng/2, 1);
  else
    return input.substr(leng/2 - 1, 2);
}