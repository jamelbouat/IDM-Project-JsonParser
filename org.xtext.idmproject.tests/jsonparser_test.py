import json
with open("file.json") as f:
	 data = json.load(f)
data["key1"] = "updatedValue1"
print(data["key1"])
with open("file.json", 'w') as file:
	 json.dump(data, file, indent=4)
