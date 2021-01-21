import json
import csv
with open("file.json") as f:
	 data = json.load(f)
data["key3"] = 2
with open("file.json", 'w') as file:
	 json.dump(data, file, indent=4)
data["key4"] = 3
with open("file.json", 'w') as file:
	 json.dump(data, file, indent=4)
keys = list(data.keys())
try:
    with open('newFile.csv', 'w') as csvfile:
        writer = csv.DictWriter(csvfile, fieldnames=keys)
        writer.writeheader()
        writer.writerow(data)
except IOError:
    print("I/O error")