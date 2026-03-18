#include <vector>
#include <string>

bool check(const std::vector<std::string>& seq, const std::string& elem) {
  
    auto it = find(seq.begin(), seq.end(), elem);
  
    if (it!= seq.end())
        return true;
    return false;
}