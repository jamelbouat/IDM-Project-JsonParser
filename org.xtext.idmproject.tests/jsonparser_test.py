import json
with open("file.json") as f:
 data = json.load(f)
data[""] = newValue
with open("file.json", 'w') as f:
 json.dump(data, f)