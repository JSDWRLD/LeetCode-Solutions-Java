class Solution {

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) 
    {
        // bolean value for each recipe, true once we deem we can make
        HashSet<String> supplySet = new HashSet<>();
        HashMap<String, Integer> recipeToIndex = new HashMap<>();
        // Map ingredient to recipes that need it
        Map<String, List<String>> dependencyGraph = new HashMap<>();

        // O(s)
        for (String s : supplies) supplySet.add(s);
        // O(n)
        for (int i = 0; i < recipes.length; i++) recipeToIndex.put(recipes[i],i);

        // Stores indegree of recipes
        int[] inDegree = new int[recipes.length];

        // For each recipe iterate list of ingredients
        // O(m)
        for (int i = 0; i < recipes.length; i++)
        {
            for (String ingredient : ingredients.get(i))
            {
                if (!supplySet.contains(ingredient))
                {
                    // Put the ingredient, and the depending recipe
                    dependencyGraph.putIfAbsent(ingredient, new ArrayList<String>());
                    dependencyGraph.get(ingredient).add(recipes[i]);
                    inDegree[i]++; // increase indegree of the recipe
                }
            }
        }

        List<String> craftedRecipes = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        // O(n)
        for (int i = 0; i < recipes.length; i++)
        {
            // inDegree of 0 means that there is no dependency on others
            if (inDegree[i] == 0) q.add(i);
        }

        // O(n + m) bounded by m ingredients
        // Q will only hold indegree of 0 recipes
        // or recipes that reached indegree of 0
        // which means we can craft it
        while (!q.isEmpty())
        {
            int curr = q.remove();
            String recipe = recipes[curr];
            craftedRecipes.add(recipe);

            if (!dependencyGraph.containsKey(recipe)) continue;

            for (String dependentRecipe : dependencyGraph.get(recipe))
            {
                int dIdx = recipeToIndex.get(dependentRecipe);
                inDegree[dIdx] -= 1;
                if (inDegree[dIdx] == 0) q.add(dIdx);
            }
        }

        // n: number of recipes, m: ingredients, s: supplies
        // Time Complexity: O(n + m + s)
        // Space Complexity: O(n + m + s)
        return craftedRecipes;
    }
    
}
